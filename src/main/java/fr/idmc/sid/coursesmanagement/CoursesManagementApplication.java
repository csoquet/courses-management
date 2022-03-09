package fr.idmc.sid.coursesmanagement;

import fr.idmc.sid.coursesmanagement.entity.Course;
import fr.idmc.sid.coursesmanagement.entity.Student;
import fr.idmc.sid.coursesmanagement.resource.CourseResource;
import fr.idmc.sid.coursesmanagement.resource.StudentResource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@SpringBootApplication
public class CoursesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner run(CourseResource courseResource, StudentResource studentResource) {
		return args -> {
			Course course = new Course("1", "SpringBoot", 16,18,"Rodislav");
			courseResource.save(course);
			Collection<Course> collection = new ArrayList<>();
			collection.add(course);
			Student student = new Student("1", "picard", "jeremy", collection);
			studentResource.save(student);

		};
	}


}
