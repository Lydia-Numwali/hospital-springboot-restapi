package com.project.hospital.services;

import com.project.hospital.models.Appointment;
import com.project.hospital.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepo appointmentRepo;

    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }

    public String addAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
        return "Appointment added";
    }

    public String getAppointmentById(int id) {
        Optional<Appointment> appointment = appointmentRepo.findById(id);
        if (appointment.isPresent()) {
            return appointment.get().toString();
        } else {
            return "Appointment not found";
        }
    }

    public String deleteAppointment(int id) {
        if (appointmentRepo.existsById(id)) {
            appointmentRepo.deleteById(id);
            return "Appointment deleted successfully";
        } else {
            return "Appointment not found";
        }
    }

    public String updateAppointment(int id, Appointment updatedAppointment) {
        Optional<Appointment> existingAppointment = appointmentRepo.findById(id);
        if (existingAppointment.isPresent()) {
            Appointment appointment = existingAppointment.get();
            appointment.setTd(updatedAppointment.getTd());
            appointment.setDoctor(updatedAppointment.getDoctor());
            appointment.setPatient(updatedAppointment.getPatient());
            // Update other fields as needed
            appointmentRepo.save(appointment);
            return "Appointment updated successfully";
        } else {
            return "Appointment not found";
        }
    }
}
