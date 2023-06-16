package com.learnOnline.services;

import java.util.List;

import com.learnOnline.entity.Course;
import com.learnOnline.entity.Lesson;

public interface StudentService {
	public Lesson getLesson(int lessonId);

	public List<Course> allCourseList();
}