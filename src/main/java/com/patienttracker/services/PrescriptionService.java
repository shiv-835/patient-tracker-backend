package com.patienttracker.services;

import com.patienttracker.dto.PrescriptionRequest;
import com.patienttracker.model.Prescription;
import com.patienttracker.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public Prescription add(PrescriptionRequest request) {
        Prescription p = new Prescription();
        p.setUserId(request.userId);
        p.setMedications(request.medications);
        p.setInstructions(request.instructions);
        return prescriptionRepository.save(p);
    }

    public List<Prescription> getByUser(String userId) {
        return prescriptionRepository.findByUserId(userId);
    }
}
