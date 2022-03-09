package fr.idmc.sid.coursesmanagement.resource;

import fr.idmc.sid.coursesmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "student")
public interface StudentResource extends JpaRepository<Student, String> {
}
