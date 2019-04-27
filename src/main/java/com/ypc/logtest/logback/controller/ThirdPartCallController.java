package com.ypc.logtest.logback.controller;

import com.ypc.logtest.logback.aop.ThirdPart;
import com.ypc.logtest.logback.data.CustomDTO;
import com.ypc.logtest.logback.service.CommonService;
import com.ypc.logtest.logback.service.ThirdPartCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-21 下午10:30
 */
@RestController
@RequestMapping("/third")
public class ThirdPartCallController {

	@Autowired
	private ThirdPartCallService thirdPartCallService;

	@Autowired
	private CommonService commonService;

	@PostMapping("/test")
	@ThirdPart
	public List<LocalDateTime> test(@RequestBody CustomDTO customDTO){
		Integer id = customDTO.getId();
		String name = customDTO.getName();
		Integer age = customDTO.getAge();
		return commonService.thirdMethod(id,name,age);
	}

}
