package com.project.hospital.controllers;

import com.project.hospital.models.MedicalRecords;
import com.project.hospital.services.MedicalRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medicalRecords")
public class MedicalRecordsController {
    @Autowired
    private MedicalRecordsService medRecService;

    public List<MedicalRecords> getMedRecords() {
        return medRecService.getAllMedicalRecords();
    }

    @PostMapping("add")
    public String addMedicalRecord(@RequestBody MedicalRecords medRec) {
        return medRecService.addMedicalRecord(medRec);
    }
}
