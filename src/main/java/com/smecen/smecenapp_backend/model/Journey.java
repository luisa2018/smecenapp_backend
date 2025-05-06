package com.smecen.smecenapp_backend.model;

import com.smecen.smecenapp_backend.enums.JourneyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
@AllArgsConstructor
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



}
