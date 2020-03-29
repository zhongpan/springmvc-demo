package com.zp.demo.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("class")
@Controller
public class RPTestHandler {
	
	String page="successrm";
	
	@RequestMapping("student")
	public String handle(@RequestParam(value="username") String un, @RequestParam(value="age", required=false, defaultValue="0") int age)
	{
		System.out.println("a student's request has come. username: "+un+", age: "+age);
		return page;
	}
	
	@RequestMapping("testhead")
	public String handleRH(@RequestHeader(value="Accept-language") String head)
	{
		System.out.println("Request Head Accept-language:"+head);
		return page;
	}	

	@RequestMapping("testCookie")
	public String handleCookieValue(@CookieValue(value="JSESSIONID") String cookie)
	{
		System.out.println("Request CookieValue JSESSIONID:"+cookie);
		return page;
	}	
}