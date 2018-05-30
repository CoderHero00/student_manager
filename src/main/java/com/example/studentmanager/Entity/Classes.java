package com.example.studentmanager.Entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ClassesId;
    @NotNull
    private long DateCreate;
    private int Status;

    public long getClassesId() {
        return ClassesId;
    }

    public void setClassesId(long classesId) {
        ClassesId = classesId;
    }

    public long getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(long dateCreate) {
        DateCreate = dateCreate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
