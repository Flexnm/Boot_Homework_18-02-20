package com.example.SpringBootHomework1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.SpringBootHomework1.Facade.ManagerFacade;
import com.example.SpringBootHomework1.beans.Course;
import com.example.SpringBootHomework1.beans.Lecturer;
import com.example.SpringBootHomework1.exceptions.CourseAlreadyExistsException;
import com.example.SpringBootHomework1.exceptions.CourseNotFoundException;
import com.example.SpringBootHomework1.exceptions.LecturerAlreadyExistsException;
import com.example.SpringBootHomework1.exceptions.LecturerNotFoundException;

@SpringBootApplication
public class SpringBootHomework1Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootHomework1Application.class, args)) {

			ManagerFacade manager = ctx.getBean(ManagerFacade.class);

//			Lecturer lec1 = new Lecturer("Nir Gal", "nir@jbh.com");
//			Lecturer lec2 = new Lecturer("Teacher LaTeach", "oof@gmail.com");
//			Lecturer lec3 = new Lecturer("Testy Test", "test@test.com");
//			manager.addLecturer(lec1);
//			manager.addLecturer(lec2);
//			manager.addLecturer(lec3);
//
//			manager.addCourse(new Course("JAVA", 450, lec1));
//			manager.addCourse(new Course("Boot", 100, lec1));
//			manager.addCourse(new Course("JavaScript", 210, lec1));
//			manager.addCourse(new Course("Agriculture", 375, lec2));
//			manager.addCourse(new Course("Engeneering", 9000, lec2));
//			manager.addCourse(new Course("Plumbing", 100, lec2));
//			manager.addCourse(new Course("Test", 200, lec3));
//			manager.addCourse(new Course("Hacking", 111, lec3));
//			manager.addCourse(new Course("WEB", 750, lec3));

//			System.out.println(manager.getAllCourses());
//			System.out.println(manager.getAllLecturers());
//			System.out.println(manager.getOneCourse(1));
//			System.out.println(manager.getOneLecturer(1));
//			
//			manager.deleteLecturer(2);
//			
//			System.out.println(manager.getAllCourses());
//			System.out.println(manager.getAllLecturers());

			manager.addCourse(new Course("MoreJava", 100, manager.getOneLecturer(1)));
			manager.addLecturer(new Lecturer("duplo", "nir@jbh.com"));
		} catch (CourseAlreadyExistsException | LecturerNotFoundException | LecturerAlreadyExistsException e) {
			System.out.println(e);
		}

	}

}
