package com.learnOnline.services;

import com.learnOnline.entity.Users;

public interface UserService {
	public void addUser(Users u);

	public boolean checkMail(String email);

	public boolean checkMailPhone(String emailPhno);

	public Users findUser(String emailPhone);

	public boolean checkRole(String emailPhone);

	public boolean validate(String emailPhno, String password);
	
}
