package fr.idmc.sid.coursesmanagement.controller;

import fr.idmc.sid.coursesmanagement.entity.Student;
import fr.idmc.sid.coursesmanagement.resource.StudentResource;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="student", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class StudentController {

    private final StudentResource studentResource;

    @GetMapping({"{idStudent}"})
    public ResponseEntity<?> getAllCourses(@PathVariable("idStudent") String idStudent) {
        Student s = studentResource.getById(idStudent);
        return ResponseEntity.ok(s.getCourses());
    }
}
