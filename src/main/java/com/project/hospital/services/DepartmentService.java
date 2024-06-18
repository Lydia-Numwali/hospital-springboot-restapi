package com.project.hospital.services;

import com.project.hospital.models.Department;
import com.project.hospital.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentRepo.findAll();
        return ResponseEntity.ok(departments);
    }

    public ResponseEntity<String> addDepartment(Department department) {
        departmentRepo.save(department);
        return ResponseEntity.status(HttpStatus.CREATED).body("Department added successfully");
    }

    public ResponseEntity<Department> getDepartmentById(int departmentId) {
        Optional<Department> department = departmentRepo.findById(departmentId);
        return department.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<String> deleteDepartment(int departmentId) {
        if (departmentRepo.existsById(departmentId)) {
            departmentRepo.deleteById(departmentId);
            return ResponseEntity.ok("Department deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department not found");
        }
    }

    public ResponseEntity<String> updateDepartment(int departmentId, Department updatedDepartment) {
        Optional<Department> optionalDepartment = departmentRepo.findById(departmentId);
        if (optionalDepartment.isPresent()) {
            Department department = optionalDepartment.get();
            department.setName(updatedDepartment.getName());
            department.setDescription(updatedDepartment.getDescription());
            // Update other fields as needed
            departmentRepo.save(department);
            return ResponseEntity.ok("Department updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department not found");
        }
    }

}
