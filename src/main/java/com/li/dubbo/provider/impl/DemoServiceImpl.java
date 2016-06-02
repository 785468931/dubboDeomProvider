package com.li.dubbo.provider.impl;

import com.li.dubbo.provider.DemoService;
import com.li.dubbo.provider.vo.User;


import java.util.ArrayList;
import java.util.List;



public class DemoServiceImpl implements DemoService<User> {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List<User> getUsers(int age) {
		
		final List<User> list = new ArrayList<User>();
		
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(age);
		u1.setSex("m");
		list.add(u1);
		
		User u2 = new User();
		u2.setName("tom");
		u2.setAge(++age);
		u2.setSex("m");
		list.add(u2);
		
		User u3 = new User();
		u3.setName("rose");
		u3.setAge(++age);
		u3.setSex("w");
		list.add(u3);
		
		return list;
	}

}
