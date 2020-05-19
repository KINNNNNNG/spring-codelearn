package com.learn.spring.context;

import com.learn.spring.context.config.ContextConfig;
import com.learn.spring.context.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname ContextApplication
 * @Description TODO
 * @Date 2020/5/19 23:41
 * @Author Wk
 * @Version 1.0
 */
public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextConfig.class
		);
		IUserService bean = context.getBean(IUserService.class);
		System.out.println(bean);
	}
}
