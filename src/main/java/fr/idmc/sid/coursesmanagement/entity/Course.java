package fr.idmc.sid.coursesmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Course {
    @Id
    private String idCourse;
    private String label;
    private int startHour;
    private int endHour;
    private String professorName;



}
