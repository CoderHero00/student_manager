package com.example.studentmanager;

import com.example.studentmanager.Entity.Classes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserModelClass extends PagingAndSortingRepository<Classes, Long> {
}
