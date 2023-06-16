package com.learnOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/studentHome")
	public String studentHome() {
		return "studentHome";
	}

	@GetMapping("/trainerHome")
	public String trainerHome() {
		return "trainerHome";
	}

	@GetMapping("/createCourse")
	public String createCourse() {
		return "createCourse";
	}

	@GetMapping("/addLesson")
	public String addLesson() {
		return "addLesson";
	}

	@GetMapping("/viewCourses")
	public String viewCourses() {
		return "viewCourses";
	}

	@GetMapping("/myCourses")
	public String myCourses() {
		return "myCourses";
	}

	@GetMapping("/lessons")
	public String lessons() {
		return "lessons";
	}

	@GetMapping("/lesson")
	public String lesson() {
		return "lesson";
	}

	@GetMapping("/addComment")
	public String addComment() {
		return "addComment";
	}

	@GetMapping("/navbar")
	public String navbar() {
		return "navbar";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/base")
	public String base() {
		return "base";
	}

	@GetMapping("/footer")
	public String footer() {
		return "footer";
	}

	@GetMapping("/purchase")
	public String purchase() {
		return "purchase";
	}

	@GetMapping("/message")
	public String message() {
		return "message";
	}

}
