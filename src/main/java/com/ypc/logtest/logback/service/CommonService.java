package com.ypc.logtest.logback.service;

import java.time.LocalDateTime;
import java.util.List;

public interface CommonService {

	List<LocalDateTime> innerMethod(Long id, String name);

	List<LocalDateTime> thirdMethod(Integer id, String name, Integer age);
}
