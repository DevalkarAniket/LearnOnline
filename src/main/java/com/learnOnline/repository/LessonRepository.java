package com.learnOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnOnline.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
