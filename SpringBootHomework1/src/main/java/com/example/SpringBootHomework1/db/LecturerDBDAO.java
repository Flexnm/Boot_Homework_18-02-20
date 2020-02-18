package com.example.SpringBootHomework1.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHomework1.beans.Lecturer;

public interface LecturerDBDAO extends JpaRepository<Lecturer, Integer>{

	
}
