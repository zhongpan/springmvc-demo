package com.zp.demo.handlers;

import com.zp.demo.beans.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/class")
@Controller
public class POJORequestHandler {

	String page="successrm";
	
	@RequestMapping("/boy")
	public String handle(Person stud)
	{
		System.out.println(stud.toString());
		return page;
	}
}