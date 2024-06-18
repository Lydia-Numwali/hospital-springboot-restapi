//package com.project.hospital.models;
//
//
//import com.project.hospital.models.*;
//import com.project.hospital.repository.*;
//import jakarta.transaction.Transactional;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import java.sql.Time;
//import java.util.Date;
//
//@SpringBootApplication
//public class Hospital {
//
//    public static void main(String[] args) {
//        SpringApplication.run(HospitalApplication.class, args);
//    }
//    @Bean
//    @Transactional
//    CommandLineRunner commandLineRunner(PatientRepo patientRepo, DoctorRepo doctorRepo, AppointmentRepo appointmentRepo, DepartmentRepo departmentRepo, MedicalRepo medicalRepo) {
//        return args -> {
//            Date date = new Date();
//            Time time = new Time(System.currentTimeMillis());
//            TimeDate td= new TimeDate(time,date);
//            Person p1=new Person("Naome","Tuyishime","0793099772",16,"female");
//            Person d1=new Person("John","Kabengera","0783099772",34,"Male");
//            Patient patient = new Patient(p1,"Kigali");
//            patientRepo.save(patient);
//
//            Doctor doctor=  new Doctor(d1,"Philosophy","john@gmail.com");
//            doctorRepo.save(doctor);
//
//
//            Department department= new Department("Cardiology","heart related issues");
//            departmentRepo.save(department);
//            doctor.getDepartments().add(department);
//            department.getDoctors().add(doctor);
//
//            doctorRepo.save(doctor);
//            departmentRepo.save(department);
//
//            MedicalRecords medicalRecords= new MedicalRecords(td,"Hypertension","qwertr","ewfererf",patient);
//            medicalRepo.save(medicalRecords);
//
//            Appointment appointment= new Appointment(td,"completed",doctor,patient);
//            appointmentRepo.save(appointment);
//
//
//        };
//    }
//
//}
