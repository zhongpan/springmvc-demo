package com.zp.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by happyBKs on 2016/7/10.
 */
public class TestInterceptor2 implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行进入TestInterceptor2的preHandle方法");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行进入TestInterceptor2的postHandle方法");
        //通过modelAndView参数改变显示的视图，或者修改发往视图的方法
//        modelAndView.addObject("msg","被拦截器的postHandle方法修改后的视图数据");
//        modelAndView.setViewName("/hello");

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行进入TestInterceptor2的afterCompletion方法");
    }
}