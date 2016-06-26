package com.domi.service;

import java.util.List;
import com.domi.model.CourseCategory;

public interface CourseService {

	List<CourseCategory> findAllCategories();

}