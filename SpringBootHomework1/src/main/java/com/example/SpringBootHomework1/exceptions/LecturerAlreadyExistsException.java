package com.example.SpringBootHomework1.exceptions;


public class LecturerAlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public LecturerAlreadyExistsException() {
		System.out.println("A lecturer already has that email.");
	}

}
