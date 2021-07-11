package com.shree.department.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.department.service.entity.Department;
import com.shree.department.service.repository.DepartmentRepository;

@Service
public class DepartmentServices {
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {

		departmentRepository.save(department);

		return department;

	}
	public Department findDepartmentById(Long departmentId) {

		return departmentRepository.getDepartmentById(departmentId);

	}

}
