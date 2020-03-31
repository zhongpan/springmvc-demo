package com.zp.demo.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sunsun on 2016/7/9.
 */

@Controller
@RequestMapping("/")
public class TestController2 {

    @RequestMapping("/login")
    public String login(){
        System.out.println("进入控制器的login方法");
        return "login";
    }

    @RequestMapping("/viewAll")
    public ModelAndView viewAll(@RequestParam("name") String name,@RequestParam("pwd") String pwd){
        ModelAndView mv = new ModelAndView();
        System.out.println("进入控制器的viewAll方法");
        System.out.println("name="+name);
        System.out.println("pwd="+pwd);
        mv.setViewName("/hello");
        return mv;
    }


}