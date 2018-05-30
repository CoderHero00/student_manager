package com.example.studentmanager.Entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EnableAutoConfiguration
@Entity
public class AttendanceSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AttendId;
    private long AttendClassId;
    private String AttendSlotId;
    private String SubjectId;
    private long AttendDate;
    private int AttendStatus;

    public long getAttendId() {
        return AttendId;
    }

    public void setAttendId(long attendId) {
        AttendId = attendId;
    }

    public long getAttendClassId() {
        return AttendClassId;
    }

    public void setAttendClassId(long attendClassId) {
        AttendClassId = attendClassId;
    }

    public String getAttendSlotId() {
        return AttendSlotId;
    }

    public void setAttendSlotId(String attendStudentId) {
        AttendSlotId = attendStudentId;
    }

    public String getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(String subjectId) {
        SubjectId = subjectId;
    }

    public long getAttendDate() {
        return AttendDate;
    }

    public void setAttendDate(long attendDate) {
        AttendDate = attendDate;
    }

    public int getAttendStatus() {
        return AttendStatus;
    }

    public void setAttendStatus(int attendStatus) {
        AttendStatus = attendStatus;
    }

    public String getStatusTake(){
        if (this.AttendStatus == 1){
            return "view";
        }else{
            return "take";
        }
    }
}
