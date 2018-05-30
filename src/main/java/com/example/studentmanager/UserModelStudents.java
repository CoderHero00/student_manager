package com.example.studentmanager;

import com.example.studentmanager.Entity.AttendanceSlot;
import com.example.studentmanager.Entity.Classes;
import com.example.studentmanager.Entity.DetailAttendance;
import com.example.studentmanager.Entity.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelStudents extends PagingAndSortingRepository<Students, Long> {
}

