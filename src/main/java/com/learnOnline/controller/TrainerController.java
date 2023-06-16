package com.learnOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnOnline.entity.Course;
import com.learnOnline.entity.Lesson;
import com.learnOnline.services.TrainerService;

@Controller
public class TrainerController {
	@Autowired
	TrainerService ts;

	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("cId") int courseId, @RequestParam("cName") String courseName,
			@RequestParam("cPrice") float coursePrice) {
		Course course = new Course();
		course.setCourseId(courseId);
		course.setCourseName(courseName);
		course.setCoursePrice(coursePrice);
		ts.addCourse(course);
		return "trainerHome";
	}

	@PostMapping("/addLesson")
	public String addLesson(@RequestParam("cId") int courseId, @RequestParam("lId") int lessonId,
			@RequestParam("lName") String lessonName, @RequestParam("lTopic") String lessonTopic,
			@RequestParam("link") String link) {
		Course course = ts.getCourse(courseId);
		Lesson lesson = new Lesson(lessonId, lessonName, lessonTopic, link, course);
		ts.addLesson(lesson);
		course.getLessons().add(lesson);
		return "trainerHome";
	}

	@GetMapping("/fetchCourses")
	public String fetchCourses(Model model) {
		List<Course> courseList = ts.courseList();
		
		model.addAttribute("courseList", courseList);
		return "viewCourses";
	}
}
