package com.patienttracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "prescriptions")
public class Prescription {

    @Id
    private String id;
    private String userId;
    private List<String> medications;
    private String instructions;

    // Getters
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public List<String> getMedications() {
        return medications;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
