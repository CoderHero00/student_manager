package com.example.studentmanager.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetailAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long DetailId;
    private long DetailSlotId;
    private long DetailStudentId;
    private long DetailAttendTime;
    private int DetailStatus;

    public long getDetailId() {
        return DetailId;
    }

    public void setDetailId(long detailId) {
        DetailId = detailId;
    }

    public long getDetailSlotId() {
        return DetailSlotId;
    }

    public void setDetailSlotId(long detailSlotId) {
        DetailSlotId = detailSlotId;
    }

    public long getDetailStudentId() {
        return DetailStudentId;
    }

    public void setDetailStudentId(long detailStudentId) {
        DetailStudentId = detailStudentId;
    }

    public long getDetailAttendTime() {
        return DetailAttendTime;
    }

    public void setDetailAttendTime(long detailAttendTime) {
        DetailAttendTime = detailAttendTime;
    }

    public int getDetailStatus() {
        return DetailStatus;
    }

    public void setDetailStatus(int detailStatus) {
        DetailStatus = detailStatus;
    }
}
