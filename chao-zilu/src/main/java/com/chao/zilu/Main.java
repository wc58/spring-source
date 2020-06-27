package com.chao.zilu;

import com.chao.zilu.config.AppConfig;
import com.chao.zilu.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IUserService bean = (IUserService) context.getBean("userService");
		bean.query();
	}

}
