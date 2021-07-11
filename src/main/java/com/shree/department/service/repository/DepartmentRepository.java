package com.shree.department.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shree.department.service.entity.Department;
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department getDepartmentById(Long departmentId);
	

}
