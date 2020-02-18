package com.example.SpringBootHomework1.exceptions;

public class CourseNotFoundException extends Exception{

	private static final long serialVersionUID = 4L;
	
	public CourseNotFoundException() {
		System.out.println("Course was not found for this id.");
	}

}
