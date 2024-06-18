package com.project.hospital.controllers;

import com.project.hospital.models.Department;
import com.project.hospital.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("allDepartments")

    @PostMapping("add")
    public ResponseEntity<String> addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable int id) {
        return departmentService.deleteDepartment(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateDepartment(@PathVariable int id, @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }
}
