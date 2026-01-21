package com.codingshuttle.springboot0To100.hospitalManagementSystem.repository;

import com.codingshuttle.springboot0To100.hospitalManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
