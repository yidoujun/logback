package com.ypc.logtest.logback.service.impl;

import com.ypc.logtest.logback.service.InnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午10:38
 */
@Service
@Slf4j
public class InnerServiceImpl implements InnerService {

//	private static final Logger LOGGER = LoggerFactory.getLogger(InnerServiceImpl.class);

	@Override
	public List<LocalDateTime> inner(Long id, String name) {
		log.info(">>>> inner service start <<<<");

		List<LocalDateTime> list = new ArrayList<>();
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());
		list.add(LocalDateTime.now());

		log.info(">>>> inner service end <<<<");
		return list;
	}
}
