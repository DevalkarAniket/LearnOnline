package com.learnOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnOnline.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
