package com.zp.demo.handlers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.zp.demo.model.Course;
import com.zp.demo.service.CourseService;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by happyBKs on 2016/6/15.
 */

@Controller
@RequestMapping("/courses")
// /courses/**
public class CourseController {


    //完成日志信息
    private static Logger log= LoggerFactory.getLogger(CourseController.class);

    private CourseService courseService;

    //使用spring容器管理里了对应的依赖关系
    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //提供完成一个业务的方法：根据课程ID查询课程内容。
    //本方法将处理 /courses/view?courseId=123 形式的URL
    @RequestMapping(value="/view", method= RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId,
                             Model model) {
        //日志输出，查看请求的courseId是不是我们的courseId
        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        model.addAttribute(course);
        return "course_overview";
    }

   //本方法将处理 /courses/view2/123 形式的URL
   @RequestMapping("/view2/{courseId}")
   public String viewCourse2(@PathVariable("courseId") Integer courseId,
                             Map<String, Object> model) {

       log.info("In viewCourse2, courseId = {}", courseId);
       Course course = courseService.getCoursebyId(courseId);
       model.put("course",course);
       return "course_overview";
   }    

  //本方法将处理 /courses/view3?courseId=123 形式的URL
  @RequestMapping("/view3")
  public String viewCourse3(HttpServletRequest request) {

      Integer courseId = Integer.valueOf(request.getParameter("courseId"));

      log.info("In viewCourse3, courseId = {}", courseId);

      Course course = courseService.getCoursebyId(courseId);
      request.setAttribute("course",course);

      return "course_overview";
  }   

  @RequestMapping(value="/admin", method = RequestMethod.GET, params = "add")
  public String createCourse(){
      return "course_admin/edit";
  }

  @RequestMapping(value="/save", method = RequestMethod.POST)
  public String  doSave(@ModelAttribute Course course){

      log.info("Info of Course:");
      log.info(ReflectionToStringBuilder.toString(course));

      //在此进行业务操作，比如数据库持久化
      course.setCourseId(123);
      return "redirect:view2/"+course.getCourseId();
  }

}