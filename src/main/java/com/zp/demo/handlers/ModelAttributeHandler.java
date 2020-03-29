package com.zp.demo.handlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zp.demo.beans.UserBean;

@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeHandler {

	@RequestMapping("/userma")
	public String handle(UserBean user)
	{
		String returnStr="modelAttributeTest1";
		System.out.println("updating "+user);
		return returnStr;
	}
	
	/*
	 * 带有@ModelAttribute注解标记的方法，会在每个目标方法执行之前被SpringMVC调用
	 * 
	 * 运行过程：
	 * 1. 执行@ModelAttribute注解修饰的方法：从数据库取出对象，把对象放入Map中。键为userBean
	 * 2. SpringMVC从Map中取出UserBean对象，并发表单中的参数赋给UserBean对象对应的属性
	 * 3. SpringMVC把上述对象传入目标方法参数
	 * 
	 * 注意：在@ModelAttribute方法中，放入Map的键必须和入参类型的第一个字母小写的字符串一致。
	 * 
	 */
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false)Integer id, Map<String,Object> map)
	{
		System.out.println("calling @ModelAttribute getUser");
		if(id!=null)//注意：如果是int id就不能够用==null来判断了
		{
			UserBean user=new UserBean(1,"zp","12345678",200);
			System.out.println("从数据库中获取对象："+user);
			map.put("userBean", user);
		}
	}

}