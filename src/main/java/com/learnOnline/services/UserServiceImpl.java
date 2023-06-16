package com.learnOnline.services;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnOnline.entity.Users;
import com.learnOnline.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repo;

	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addUser(Users u) {
		repo.save(u);
	}

	@Override
	public boolean checkMail(String email) {
		return repo.existsByEmail(email);
	}

	@Override
	public boolean checkMailPhone(String emailPhone) {
		if (repo.existsByEmail(emailPhone) || repo.existsByPhno(emailPhone)) {
			return true;
		} else {
			System.out.println("Username not exists");
			return false;
		}
	}

	@Override
	public Users findUser(String emailPhno) {
		Pattern mobilePattern = Pattern.compile("^[0-9]{10}$");
		boolean checkPattern = mobilePattern.matcher(emailPhno).matches();
		if (checkPattern == true) {
			return repo.getByPhno(emailPhno);
		} else {
			return repo.getByEmail(emailPhno);
		}
	}

	@Override
	public boolean validate(String emailPhno, String password) {
		Users u = findUser(emailPhno);
		if ((u.getPassword()).equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean checkRole(String emailPhone) {
		Users u = findUser(emailPhone);
		return u.getRole().equalsIgnoreCase("Trainer") ? true : false;
	}
}