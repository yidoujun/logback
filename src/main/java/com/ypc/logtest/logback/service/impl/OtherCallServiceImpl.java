package com.ypc.logtest.logback.service.impl;

import com.ypc.logtest.logback.service.OtherCallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午10:50
 */
@Service
@Slf4j
public class OtherCallServiceImpl implements OtherCallService {
	@Override
	public List<String> service(Integer pageNo, String title) {
		log.info(">>>> third part call service start <<<<");
		List<String> list = new ArrayList<>();
		list.add(System.currentTimeMillis() + "");
		list.add(System.currentTimeMillis() + "");
		list.add(System.currentTimeMillis() + "");
		list.add(System.currentTimeMillis() + "");
		list.add(System.currentTimeMillis() + "");
		log.info(">>>> third part call service end <<<<");
		return list;
	}
}
