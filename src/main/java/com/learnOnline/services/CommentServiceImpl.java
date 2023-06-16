package com.learnOnline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnOnline.entity.Comments;
import com.learnOnline.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentRepository commentRepo;

	public CommentServiceImpl(CommentRepository commentRepo) {
		super();
		this.commentRepo = commentRepo;
	}

	public CommentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Comments> commentList() {
		return commentRepo.findAll();

	}

	@Override
	public void addComment(Comments comment) {
		commentRepo.save(comment);
	}
}
