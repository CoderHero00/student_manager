package com.example.studentmanager;

import com.example.studentmanager.Entity.StudentClassCon;
import com.example.studentmanager.Entity.TimeSlot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelClassStudent extends PagingAndSortingRepository<StudentClassCon, Long> {
}
