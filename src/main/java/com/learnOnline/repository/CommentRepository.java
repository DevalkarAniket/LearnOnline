package com.learnOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnOnline.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
