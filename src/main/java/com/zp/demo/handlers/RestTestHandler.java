package com.zp.demo.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/rest")
@Controller
public class RestTestHandler {
	
	/*
	 * Rest 风格的Url        原先利用请求参数的风格
	 * 以CRUD为例
	 * 新增： /order POST		
	 * 修改：/order/1 Put 		update?id=1
	 * 获取：/order/1 GET 		get?id=1
	 * 删除：/order/1 DELETE		delete?id=1
	 * 
	 * 如何发送PUT请求和DELETE请求？
	 * 1.需要配置HiddenHttpMethodFilter
	 * 2.需要发送POST请求
	 * 3.需要在发送POST请求时携带一个name=”_method“的隐藏域，值为DELETE或PUT
	 *	
	 * 在SpringMVC的目标方法中如何得到id呢？
	 * 使用@PathVariable注解
	 */
	
	
	@RequestMapping(value="/methodstest/{id}",method=RequestMethod.GET)
	public String restGet(@PathVariable int id)//当@PathVariable没有标明{id}，
	{
		System.out.println("get "+id);
		System.out.println("query operations...");
		return "query";
	}
	
	@RequestMapping(value="/methodstest",method=RequestMethod.POST)
	public String restPost()
	{
		System.out.println("post ");
		System.out.println("post operations...");
		return "post";
	}
	
    @RequestMapping(value="/methodstest/{id}",method=RequestMethod.PUT)
    @ResponseBody
	public String restPut(@PathVariable int id)
	{
		System.out.println("put "+id);
		System.out.println("put operations...");
		return "put success";
	}
	
    @RequestMapping(value="/methodstest/{id}",method=RequestMethod.DELETE)
    @ResponseBody    
	public String restDelete(@PathVariable int id)
	{
		System.out.println("delete "+id);
		System.out.println("delete operations...");
		return "delete success";
	}
}