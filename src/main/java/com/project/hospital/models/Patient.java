package com.project.hospital.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Embedded
    private Person person;
    private String address;


    @OneToMany(mappedBy = "patient")
    @Fetch(FetchMode.JOIN)
    private Set<Appointment> appointments = new HashSet<>();

    @OneToMany(mappedBy = "patient")
    @Fetch(FetchMode.JOIN)
    private Set<MedicalRecords> medicalRecords = new HashSet<>();

    public Patient() {
    }

    public Patient(Person person,String address) {
        this.person = person;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
    public Set<MedicalRecords> getMedicalRecords() {
        return medicalRecords;
    }
    public void setMedicalRecords(Set<MedicalRecords> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

}
