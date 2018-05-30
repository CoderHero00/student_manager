package com.example.studentmanager;

import com.example.studentmanager.Entity.TimeSlot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelTimeSlot extends PagingAndSortingRepository<TimeSlot, Long> {
}
