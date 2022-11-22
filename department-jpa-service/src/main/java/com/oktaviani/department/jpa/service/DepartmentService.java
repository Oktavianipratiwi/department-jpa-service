/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oktaviani.department.jpa.service;

import com.oktaviani.department.jpa.entity.Department;
import com.oktaviani.department.jpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class DepartmentService {
      @Autowired
    private DepartmentRepository departmentRepository;
    
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    
    public Department findDepartmentById(Long departmentId){
        return departmentRepository.findByDepartmentId(departmentId);
    }   
}
