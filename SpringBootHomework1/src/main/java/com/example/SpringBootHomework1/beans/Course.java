package com.example.SpringBootHomework1.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	@Column
	private String name;
	@Column
	private int duration;
	@ManyToOne
	private Lecturer lecturer;
	
	public Course() {
		
	}
	
	public Course(String name, int duration, Lecturer lecturer) {
		setName(name);
		setDuration(duration);
		setLecturer(lecturer);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Lecturer getLecturer() {
		return lecturer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
	public String toString() {
		return "Course " + number + " - " + name + " - " + duration + " hours";
	}

}
