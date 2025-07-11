package com.patienttracker.dto;

import java.util.List;

public class PrescriptionRequest {
    public String userId;
    public List<String> medications;
    public String instructions;
}
