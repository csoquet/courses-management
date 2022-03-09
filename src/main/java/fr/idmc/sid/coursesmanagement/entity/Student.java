package fr.idmc.sid.coursesmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {

    @Id
    private String idStudent;
    private String name;
    private String surname;

    @OneToMany
    private Collection<Course> courses;


}
