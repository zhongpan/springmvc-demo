package com.zp.demo.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    
    @RequestMapping("/baymax")
	public String hello()
	{
		System.out.println("hello, springMVC!");
		return "baymax";
	}

}