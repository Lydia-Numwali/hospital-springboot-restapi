package com.project.hospital.controllers;

import com.project.hospital.models.Doctor;
import com.project.hospital.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("allDoctors")
    public List<Doctor> getAllDoctors(Doctor doctor) {
        return doctorService.getAllDoctors();
    }

    @GetMapping("doctor/{id}")
    public String getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }
    @PostMapping("add")
    public String addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }
}
