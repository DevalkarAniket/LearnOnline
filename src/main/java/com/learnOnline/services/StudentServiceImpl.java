package com.learnOnline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnOnline.entity.Course;
import com.learnOnline.entity.Lesson;
import com.learnOnline.repository.CourseRepository;
import com.learnOnline.repository.LessonRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	LessonRepository lessonRepo;

	public StudentServiceImpl(LessonRepository lessonRepo) {
		super();
		this.lessonRepo = lessonRepo;
	}

	public StudentServiceImpl() {
		super();
	}

	public StudentServiceImpl(CourseRepository courseRepo) {
		super();
		this.courseRepo = courseRepo;
	}

	@Override
	public Lesson getLesson(int lessonId) {
		return lessonRepo.findById(lessonId).get();
	}

	@Override
	public List<Course> allCourseList() {
		return courseRepo.findAll();
	}

}
