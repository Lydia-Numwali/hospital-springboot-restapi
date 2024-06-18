package com.project.hospital.services;

import com.project.hospital.models.Doctor;
import com.project.hospital.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    public String addDoctor(Doctor doctor) {
        doctorRepo.save(doctor);
        return "Doctor added";
    }

    public String getDoctorById(int id) {
        doctorRepo.findById(id);
        return "Doctor found";
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

}
