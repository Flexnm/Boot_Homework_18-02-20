package com.example.SpringBootHomework1.exceptions;

public class CourseAlreadyExistsException extends Exception{

	private static final long serialVersionUID = 3L;

	public CourseAlreadyExistsException() {
		System.out.println("Course with this name already exists in the database.");
	}

}
