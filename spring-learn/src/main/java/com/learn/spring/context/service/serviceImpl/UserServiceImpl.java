package com.learn.spring.context.service.serviceImpl;

import com.learn.spring.context.service.IUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/5/19 23:39
 * @Author Wk
 * @Version 1.0
 */
@Service
@Scope("singleton")
public class UserServiceImpl implements IUserService {
	public UserServiceImpl() {
		System.out.println("build UserServiceImpl");
	}
}
