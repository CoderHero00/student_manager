package com.example.studentmanager;

import com.example.studentmanager.Entity.AttendanceSlot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelSlot extends PagingAndSortingRepository<AttendanceSlot, Long> {
}
