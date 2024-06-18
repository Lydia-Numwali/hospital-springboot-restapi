package com.project.hospital.services;

import com.project.hospital.models.MedicalRecords;
import com.project.hospital.repository.MedicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordsService {
    @Autowired
    private MedicalRepo medRepo;

    public List<MedicalRecords> getAllMedicalRecords() {
        return medRepo.findAll();
    }

    public String addMedicalRecord(MedicalRecords medRec) {
        medRepo.save(medRec);
        return "Medical Records Added";
    }
}
