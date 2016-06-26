package com.domi.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domi.model.Course;
import com.domi.model.CourseCategory;
import com.domi.service.CourseService;


@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/addCourse",  method = RequestMethod.GET)
	public String getMinutes(@ModelAttribute ("course") Course exercise) {
	
		return "addCourse";
	}
	
	@RequestMapping(value = "/addCourse",  method = RequestMethod.POST)
	public String addMinutes(@Valid @ModelAttribute ("course") Course course, BindingResult result) {
		
		System.out.println("course name: " + course.getName());
		System.out.println("course length: " + course.getMinutes());
		System.out.println("course category: " + course.getCategory());
		
		if(result.hasErrors()) {
			return "addCourse";
		}
		
		return "addCourse";
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public @ResponseBody List<CourseCategory> findAllCategories() {
		return courseService.findAllCategories();
	}
	
}
