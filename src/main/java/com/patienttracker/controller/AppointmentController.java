package com.patienttracker.controller;

import com.patienttracker.dto.AppointmentRequest;
import com.patienttracker.model.Appointment;
import com.patienttracker.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment book(@RequestBody AppointmentRequest request) {
        return appointmentService.book(request);
    }

    @GetMapping("/user/{userId}")
    public List<Appointment> getUserAppointments(@PathVariable String userId) {
        return appointmentService.getAppointmentsByUser(userId);
    }

    @DeleteMapping("/{id}")
    public void cancel(@PathVariable String id) {
        appointmentService.cancel(id);
    }
}
