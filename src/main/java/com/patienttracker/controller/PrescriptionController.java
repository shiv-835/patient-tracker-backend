package com.patienttracker.controller;

import com.patienttracker.dto.PrescriptionRequest;
import com.patienttracker.model.Prescription;
import com.patienttracker.services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
@CrossOrigin
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping
    public Prescription add(@RequestBody PrescriptionRequest request) {
        return prescriptionService.add(request);
    }

    @GetMapping("/user/{userId}")
    public List<Prescription> getByUser(@PathVariable String userId) {
        return prescriptionService.getByUser(userId);
    }
}
