package com.project.hospital.controllers;

import com.project.hospital.models.Patient;
import com.project.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("allPatients")
    public List<Patient> getPatients() {
       return patientService.getPatients();
    }
    @PostMapping("add")
    public String addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("patient/{id}")
    public String getPatient(@PathVariable int id){
        return patientService.getPatient(id);
    }
}
