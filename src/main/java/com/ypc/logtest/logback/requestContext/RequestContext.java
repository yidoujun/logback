package com.ypc.logtest.logback.requestContext;

/**
 * @description:
 * @Author: ypcfly
 * @Date: 19-4-15 下午9:21
 */
public class RequestContext {

	private static final ThreadLocal requestContext = new ThreadLocal();

	private static void set(Object object) {
		requestContext.set(object);
	}

	private static void remove() {
		requestContext.remove();
	}

}
