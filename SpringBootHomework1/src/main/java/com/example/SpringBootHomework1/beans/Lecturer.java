package com.example.SpringBootHomework1.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lecturers")
public class Lecturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@OneToMany(mappedBy = "lecturer", fetch = FetchType.EAGER)
	private List<Course> courses;

	public Lecturer() {

	}

	public Lecturer(String name, String email) {
		setName(name);
		setEmail(email);
	}

	public Lecturer(String name, String email, List<Course> courses) {
		setName(name);
		setEmail(email);
		setCourses(courses);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public String toString() {
		return "Lecturer #" + id + ": " + name + ", email: " + email + ", teaches: " + courses;
	}

}
