package com.patienttracker.services;

import com.patienttracker.dto.AppointmentRequest;
import com.patienttracker.model.Appointment;
import com.patienttracker.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment book(AppointmentRequest request) {
        Appointment appt = new Appointment();
        appt.setUserId(request.userId);
        appt.setDoctor(request.doctor);
        appt.setDate(request.date);
        appt.setTime(request.time);
        return appointmentRepository.save(appt);
    }

    public List<Appointment> getAppointmentsByUser(String userId) {
        return appointmentRepository.findByUserId(userId);
    }

    public void cancel(String id) {
        appointmentRepository.deleteById(id);
    }
}
