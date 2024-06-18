package com.project.hospital.services;

import com.project.hospital.models.Patient;
import com.project.hospital.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public List<Patient> getPatients() {
        return patientRepo.findAll();
    }

    public String addPatient(Patient patient) {
        patientRepo.save(patient);
        return "Patient added";
    }
    public String getPatient(int id){
        patientRepo.findById(id);
        return "Patient found";
    }
}
