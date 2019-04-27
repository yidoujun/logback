package com.ypc.logtest.logback.aop;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午8:44
 */
@Slf4j
@Aspect
@Component
public class CustomLogAspect {

	private Gson gson = new Gson();

	@Around("within(com.ypc.logtest.logback.controller..*) && !@annotation(com.ypc.logtest.logback.aop.ThirdPart)")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		// 目标类的名称
		String className = joinPoint.getTarget().getClass().getName();
		// 方法名称
		String methodName = joinPoint.getSignature().getName();
		// 参数列表
		Parameter[] parameters = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameters();
		Object[] args = joinPoint.getArgs();

		StringBuilder params = new StringBuilder("[");
		for (int i = 0; i < parameters.length; i++) {
			params.append(parameters[i].getName()).append(":").append(args[i]).append("; ");
		}
		if (parameters.length > 0) {
			int length = params.length();
			params.delete(length - 2, length);
		}
		params.append("]");
		log.info(">>>> Target class name={} | method name={} | params={} <<<<",className,methodName,params);
		Object result = null;
		try {
			// 执行方法
			result = joinPoint.proceed();
		} catch (Exception e) {
			// 记录异常日志
			log.error(">>>> Target class name={} | method name={}\n{}\n\t at {} <<<<",className, methodName, e.toString(), e.getStackTrace()[0]);
			throw e;
		}
		// 记录方法结果
		log.info(">>>> Target class name={} | method name={} | results={} <<<<",className, methodName, gson.toJson(result));
		return result;
	}

}
