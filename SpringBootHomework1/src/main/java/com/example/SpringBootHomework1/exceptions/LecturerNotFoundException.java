package com.example.SpringBootHomework1.exceptions;

public class LecturerNotFoundException extends Exception {
	
	private static final long serialVersionUID = 2L;

	public LecturerNotFoundException() {
		System.out.println("Lecturer was not found for this id.");
	}

}
