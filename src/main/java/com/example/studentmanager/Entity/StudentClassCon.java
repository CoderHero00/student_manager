package com.example.studentmanager.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class StudentClassCon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long conID;
    private long ConStudentID;
    private long ConClassID;
    private long ConCreateTIme;
    private int Status;

    public long getConStudentID() {
        return ConStudentID;
    }

    public void setConStudentID(long conStudentID) {
        ConStudentID = conStudentID;
    }

    public long getConClassID() {
        return ConClassID;
    }

    public void setConClassID(long conClassID) {
        ConClassID = conClassID;
    }

    public long getConCreateTIme() {
        return ConCreateTIme;
    }

    public void setConCreateTIme(long conCreateTIme) {
        ConCreateTIme = conCreateTIme;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }


}
