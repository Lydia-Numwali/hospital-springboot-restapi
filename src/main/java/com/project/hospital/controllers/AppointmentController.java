package com.project.hospital.controllers;

import com.project.hospital.models.Appointment;
import com.project.hospital.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("allAppointments")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public String getAppointmentById(@PathVariable int id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping("add")
    public String addAppointment(@RequestBody Appointment appointment) {
        return appointmentService.addAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAppointment(@PathVariable int id) {
        return appointmentService.deleteAppointment(id);
    }

    @PutMapping("/update/{id}")
    public String updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
        return appointmentService.updateAppointment(id, appointment);
    }
}
