package com.learnOnline.services;

import java.util.List;

import com.learnOnline.entity.Course;
import com.learnOnline.entity.Lesson;

public interface TrainerService {
	public void addCourse(Course c);

	public void addLesson(Lesson l);
	
	public Course getCourse(int courseId);
	
	public List<Course> courseList();
}
