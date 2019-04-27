package com.ypc.logtest.logback.service.impl;

import com.ypc.logtest.logback.aop.ThirdPart;
import com.ypc.logtest.logback.service.CommonService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-27 下午6:30
 */
@Service
@Slf4j
public class CommonServiceImpl implements CommonService {


	private static final Logger LOGGER = LoggerFactory.getLogger("third_part_call_log");

	@Override
	public List<LocalDateTime> innerMethod(Long id, String name) {
		log.info(">>>> common service inner method start <<<<");

		List<LocalDateTime> list = new ArrayList<>();
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());

		log.info(">>>> common service inner method end <<<<");
		return list;
	}

	@Override
	public List<LocalDateTime> thirdMethod(Integer id, String name, Integer age) {
		LOGGER.info(">>>> common service start, request params:id={}, name={}, age={} <<<<",id,name,age);
		List<LocalDateTime> list = new ArrayList<>();
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now().plusDays(1));
		list.add(LocalDateTime.now().plusDays(2));
		list.add(LocalDateTime.now().plusDays(3));

		LOGGER.info(">>>> common service third method end <<<<");
		return list;
	}
}
