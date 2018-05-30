package com.example.studentmanager.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long StudnetId;
    @NotNull
    @Size(min=7, message = "more than 7 character")
    private String StudentName;

    public long getStudnetId() {
        return StudnetId;
    }

    public void setStudnetId(long studnetId) {
        StudnetId = studnetId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}

