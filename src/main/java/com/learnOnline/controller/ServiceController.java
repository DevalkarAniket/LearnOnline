package com.learnOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnOnline.entity.Comments;
import com.learnOnline.entity.Users;
import com.learnOnline.services.CommentService;
import com.learnOnline.services.UserService;

@Controller
public class ServiceController {
	@Autowired
	UserService us;
	@Autowired
	CommentService cs;

	@PostMapping("/addUser")
	public String addUser(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("email") String email, @RequestParam("phno") String phno,
			@RequestParam("password") String password, @RequestParam("role") String role) {
		boolean emailExists = us.checkMail(email);
		if (emailExists == false) {
			Users u = new Users();
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setPhno(phno);
			u.setPassword(password);
			u.setRole(role);
			us.addUser(u);
			System.out.println("User register Sucessfully !");
			return "login";
		} else {
			System.out.println("User already exists.");
			return "login";
		}
	}

	@PostMapping("/validate")
	public String validate(@RequestParam("emailPhone") String emailPhone, @RequestParam("password") String password) {
		boolean emailPhoneExists = us.checkMailPhone(emailPhone);
		boolean checkPass = us.validate(emailPhone, password);
		boolean checkRole = us.checkRole(emailPhone);
		if (emailPhoneExists == true && checkPass == true) {
			if (checkRole == true) {
				return "trainerHome";
			} else {
				return "studentHome";
			}
		} else {
			System.out.println("Incorrect Credential.");
			return "login";
		}
	}

	@PostMapping("/addComment")
	public String addComment(@RequestParam("comment") String comment, Model model) {
		Comments c = new Comments();
		c.setComment(comment);
		cs.addComment(c);
		List<Comments> commentList = cs.commentList();
		model.addAttribute("Comment", commentList);
		return "lessons";
	}
}
