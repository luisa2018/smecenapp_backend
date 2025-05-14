package com.smecen.smecenapp_backend.model;

import com.smecen.smecenapp_backend.enums.JourneyStatus;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "journeys")
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJourney;


    @Column(name = "name",nullable = false, length = 150)
    private String name;

    @Column(name = "description",nullable = false, length = 200)
    private String description;
    @Column(name = "context",nullable = true, length = 200)
    private String context;

    @Enumerated(EnumType.STRING)
    private JourneyStatus status;
    private Instant createdAt;
    private Instant updatedAt;

    public Integer getIdJourney() {
        return idJourney;
    }

    public void setIdJourney(Integer idJourney) {
        this.idJourney = idJourney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public JourneyStatus getStatus() {
        return status;
    }

    public void setStatus(JourneyStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
