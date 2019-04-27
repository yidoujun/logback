package com.ypc.logtest.logback.config;

import com.ypc.logtest.logback.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午11:02
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(getInterceptor()).addPathPatterns("/**");
	}

	private RequestInterceptor getInterceptor() {
		return new RequestInterceptor();
	}
}
