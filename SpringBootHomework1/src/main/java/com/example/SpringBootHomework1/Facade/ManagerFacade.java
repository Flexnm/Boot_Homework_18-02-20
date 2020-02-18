package com.example.SpringBootHomework1.Facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.SpringBootHomework1.beans.Course;
import com.example.SpringBootHomework1.beans.Lecturer;
import com.example.SpringBootHomework1.db.CourseDBDAO;
import com.example.SpringBootHomework1.db.LecturerDBDAO;
import com.example.SpringBootHomework1.exceptions.CourseNotFoundException;
import com.example.SpringBootHomework1.exceptions.LecturerNotFoundException;

@Component
public class ManagerFacade {

	@Autowired
	private LecturerDBDAO lecDB;
	@Autowired
	private CourseDBDAO corDB;

	public ManagerFacade() {

	}

	public void addLecturer(Lecturer lecturer) {
//		for (Lecturer lec : lecDB.findAll()) {
//				if (lecturer.getEmail().equals(lec.getEmail())) {
//					throw new LecturerAlreadyExistsException();
//				}
//			}
		lecDB.save(lecturer);
	}

	public List<Lecturer> getAllLecturers() {
		return lecDB.findAll();
	}

	public void deleteLecturer(int id) {
		for (Course c : corDB.findAll()) {
			if(c.getLecturer().getId() == id) {
				corDB.delete(c);
			}
		}
		lecDB.deleteById(id);
	}

	public Lecturer getOneLecturer(int id) throws LecturerNotFoundException {
		return lecDB.findById(id).orElseThrow(LecturerNotFoundException::new);
	}

	public void addCourse(Course course) {
//		if (corDB.findAll() != null) {
//			for (Course cor : corDB.findAll()) {
//				if (course.getName().equals(cor.getName())) {
//					throw new CourseAlreadyExistsException();
//				}
//			}
//		}
		corDB.save(course);
	}

	public void deleteCourse(int id) {
		corDB.deleteById(id);
	}

	public List<Course> getAllCourses() {
		return corDB.findAll();
	}

	public Course getOneCourse(int number) throws CourseNotFoundException {
		return corDB.findById(number).orElseThrow(CourseNotFoundException::new);
	}

}
