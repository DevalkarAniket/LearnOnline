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
import com.learnOnline.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService ss;

	@PostMapping("/viewLesson")
	public String myLesson(@RequestParam("lId") int lessonId, Model model) {
		Lesson lesson = ss.getLesson(lessonId);
		model.addAttribute("lesson", lesson);
		return "lesson";
	}

	@GetMapping("/getCourse")
	public String getCourse(Model model) {
		List<Course> allCourseList = ss.allCourseList();
		model.addAttribute("courseList", allCourseList);
		return "purchase";
	}
}
