package com.zp.demo.handlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zp.demo.beans.Sword;

@SessionAttributes(value="SW1",types={String.class})
@RequestMapping("/model")
@Controller
public class ModelDataHandlerSession {
	
	/*
	 * 
	 * @SessionAttributes 
	 * 除了可以通过属性名指定需要放到会话中的属性外，(实际上使用的是value属性值)
	 * 还可以通过模型属性的对象类型指定哪些模型属性需要放到会话中(实际上使用的是types属性值)
	 * 
	 * 注意：该注解只能放在类的上面而不能放在方法上面
	 */
	
	
	@RequestMapping("/sessiontest")
	public String handle1(Map<String,Object> map)
	{
		String returnStr="SessionAnnotationTest";
		Sword s=new Sword("水晶剑", 40);
		map.put("SW1", s);
		map.put("myname", "zp");
		map.put("age", 100);
		return returnStr;
	}
	

}