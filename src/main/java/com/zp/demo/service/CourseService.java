package com.zp.demo.service;

import com.zp.demo.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {

	Course getCoursebyId(Integer courseId);
}