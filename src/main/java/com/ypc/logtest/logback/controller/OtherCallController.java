package com.ypc.logtest.logback.controller;

import com.ypc.logtest.logback.service.OtherCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午10:58
 */
@RestController
@RequestMapping("/other")
public class OtherCallController {

	@Autowired
	private OtherCallService thirdPartService;

	@GetMapping("/hello")
	public List<String> test(@RequestParam("pageNo") Integer pageNo,@RequestParam("title") String title) {
		return thirdPartService.service(pageNo,title);
	}

}
