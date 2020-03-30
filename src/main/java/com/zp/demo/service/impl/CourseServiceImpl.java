package com.zp.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zp.demo.model.Chapter;
import com.zp.demo.model.Course;
import com.zp.demo.service.CourseService;
import org.springframework.stereotype.Service;



@Service("courseService")
public class CourseServiceImpl implements CourseService {

    public Course getCoursebyId(Integer courseId) {

        Course course = new Course();

        course.setCourseId(courseId);
        course.setTitle("springMVC笔记系列");
        course.setImgPath("resources/img/baymax.jpg");
        course.setLearningNum(12345);
        course.setLevel(2);
        course.setLevelDesc("中级");
        course.setDuration(7200l);
        course.setDescr("springMVC哈哈哈哈。");

        List<Chapter> chapterList = new ArrayList<Chapter>();

        warpChapterList(courseId,chapterList);

        course.setChapterList(chapterList);

        return course;
    }

    private void warpChapterList(Integer courseId,List<Chapter> chapterList) {
        Chapter chapter = new Chapter();
        chapter.setId(1);
        chapter.setCourseId(courseId);
        chapter.setOrder(1);
        chapter.setTitle("第1章 什么springMVC");
        chapter.setDescr("此处略去1个字");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(2);
        chapter.setCourseId(courseId);
        chapter.setOrder(2);
        chapter.setTitle("第2章 环境搭建");
        chapter.setDescr("此处略去2个字");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(3);
        chapter.setCourseId(courseId);
        chapter.setOrder(3);
        chapter.setTitle("第3章 前端控制器");
        chapter.setDescr("此处略去3个字");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(4);
        chapter.setCourseId(courseId);
        chapter.setOrder(4);
        chapter.setTitle("第4章 spring上下文环境配置");
        chapter.setDescr("此处略去4个字");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(5);
        chapter.setCourseId(courseId);
        chapter.setOrder(5);
        chapter.setTitle("第5章 示例");
        chapter.setDescr("此处略去5个字");
        chapterList.add(chapter);

    }




}