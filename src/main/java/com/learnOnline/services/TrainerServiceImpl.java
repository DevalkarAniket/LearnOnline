package com.learnOnline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnOnline.entity.Course;
import com.learnOnline.entity.Lesson;
import com.learnOnline.repository.CourseRepository;
import com.learnOnline.repository.LessonRepository;

@Service
public class TrainerServiceImpl implements TrainerService {
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	LessonRepository lessonRepo;

	public TrainerServiceImpl(LessonRepository lessonRepo) {
		super();
		this.lessonRepo = lessonRepo;
	}

	public TrainerServiceImpl() {
		super();
	}

	public TrainerServiceImpl(CourseRepository courseRepo) {
		super();
		this.courseRepo = courseRepo;
	}

	@Override
	public void addCourse(Course c) {
		courseRepo.save(c);
	}

	@Override
	public void addLesson(Lesson l) {
		lessonRepo.save(l);
	}

	@Override
	public Course getCourse(int courseId) {
		return courseRepo.findById(courseId).get();
	}

	@Override
	public List<Course> courseList() {
		return courseRepo.findAll();
	}
}
