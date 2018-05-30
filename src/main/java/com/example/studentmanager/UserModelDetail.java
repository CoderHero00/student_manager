package com.example.studentmanager;

import com.example.studentmanager.Entity.DetailAttendance;
import com.example.studentmanager.Entity.StudentClassCon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelDetail extends PagingAndSortingRepository<DetailAttendance, Long> {
    Page<DetailAttendance> findByDetailSlotId(long a);
}
