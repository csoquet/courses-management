package fr.idmc.sid.coursesmanagement.resource;

import fr.idmc.sid.coursesmanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "class")
public interface CourseResource extends JpaRepository<Course, String> {


}