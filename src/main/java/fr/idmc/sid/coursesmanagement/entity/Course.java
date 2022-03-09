package fr.idmc.sid.coursesmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

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
