package com.smecen.smecenapp_backend.model;

import com.smecen.smecenapp_backend.enums.JourneyStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.time.Instant;

@Entity
@Data
@Table(name = "journeys")
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJourney;
    @Column(name = "name",nullable = false, length = 150)
    private String name;

    @Column(name = "description",nullable = false, length = 200)
    private String description;
    @Column(name = "context",nullable = false, length = 200)
    private String context;

    @Enumerated(EnumType.STRING)
    private JourneyStatus status;
    private Instant createdAt;
    private Instant updatedAt;



}
