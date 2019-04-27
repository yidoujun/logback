package com.ypc.logtest.logback.service.impl;

import com.ypc.logtest.logback.aop.ThirdPart;
import com.ypc.logtest.logback.service.ThirdPartCallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-21 下午10:32
 */
@Service
@Slf4j
public class ThirdPartCallServiceImpl implements ThirdPartCallService {

	@ThirdPart
	@Override
	public List<LocalDateTime> service(Integer id, String name, Integer age) {
		// log 记录的日志依然会输出到服务日志文件
		log.info(">>>> request params:id={}, name={}, age={} <<<<",id,name,age);
		List<LocalDateTime> list = new ArrayList<>();
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now().plusDays(1));
		list.add(LocalDateTime.now().plusDays(2));
		list.add(LocalDateTime.now().plusDays(3));

		log.info(">>>> third call service start <<<<");
		return list;
	}
}
