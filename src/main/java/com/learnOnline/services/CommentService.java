package com.learnOnline.services;

import java.util.List;

import com.learnOnline.entity.Comments;

public interface CommentService {
	public List<Comments> commentList();

	public void addComment(Comments comment);
}
