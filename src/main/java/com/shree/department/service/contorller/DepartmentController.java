package com.shree.department.service.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.department.service.entity.Department;
import com.shree.department.service.services.DepartmentServices;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
	@Autowired
	DepartmentServices departmentServices;
	
	@PostMapping("/")
	Department saveDepartmentEntity(@RequestBody Department department){
		log.info("inside save controller");
		return departmentServices.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	Department getDepartmentById(@PathVariable("id") Long departmentId) {
		
		return departmentServices.findDepartmentById(departmentId);
	}
	
}
