package com.example.SpringBootHomework1.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHomework1.beans.Course;

public interface CourseDBDAO extends JpaRepository<Course, Integer>{

}
