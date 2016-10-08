package com.atguigu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/helloworld")
	public String sayHello(){
		System.out.println("这里是controller方法");
		return "success";
	}
}
