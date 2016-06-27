package com.domi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.domi.model.CourseCategory;


@Service("courseService")
public class CourseServiceImpl implements CourseService {

	public List<CourseCategory> findAllCategories() {
		
		List<CourseCategory> activities = new ArrayList<CourseCategory>();
		
		CourseCategory run = new CourseCategory();
		run.setDesc("Introduction");
		activities.add(run);
		
		CourseCategory bike = new CourseCategory();
		bike.setDesc("Finance");
		activities.add(bike);
		
		CourseCategory swim = new CourseCategory();
		swim.setDesc("Accounting");
		activities.add(swim);
		
		return activities;
	}
	
	public void testFunction2() {
		
	}
	
	public void testFunction3() {
		int k = 11;
		for(int i = 10; i<100; i++) {
			System.out.println("Testing now");
		}
		int kk = 2;
	}
	
	
	
}
