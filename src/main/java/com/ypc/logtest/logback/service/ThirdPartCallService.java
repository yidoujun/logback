package com.ypc.logtest.logback.service;

import java.time.LocalDateTime;
import java.util.List;

public interface ThirdPartCallService {
	List<LocalDateTime> service(Integer id, String name, Integer age);
}
