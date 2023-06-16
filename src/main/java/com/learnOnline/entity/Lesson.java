package com.learnOnline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
	@Id
	int lessonId;
	String lessonName;
	String lessonTopic;
	String link;
	@ManyToOne
	Course course;
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lessonId, String lessonName, String lessonTopic, String link, Course course) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.lessonTopic = lessonTopic;
		this.link = link;
		this.course = course;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessonTopic() {
		return lessonTopic;
	}
	public void setLessonTopic(String lessonTopic) {
		this.lessonTopic = lessonTopic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lesson [lessonId=" + lessonId + ", lessonName=" + lessonName + ", lessonTopic=" + lessonTopic
				+ ", link=" + link + ", course=" + course + "]";
	}
}
