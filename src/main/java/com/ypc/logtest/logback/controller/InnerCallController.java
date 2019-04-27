package com.ypc.logtest.logback.controller;

import com.ypc.logtest.logback.service.CommonService;
import com.ypc.logtest.logback.service.InnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午10:36
 */
@RestController
@RequestMapping("/inner")
public class InnerCallController {

	@Autowired
	private InnerService innerService;

	@Autowired
	private CommonService commonService;

	@GetMapping("/hello")
	public List<LocalDateTime> hello(@RequestParam("id") Long id,@RequestParam("name") String name) {
//		return innerService.inner(id,name);

		return commonService.innerMethod(id,name);
	}

}
