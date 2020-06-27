package com.chao.zilu.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
	public UserService() {

		System.out.println("service .....");
	}

	public void query() {
		System.out.println("select * from tb_user");
	}
}
