package com.smecen.smecenapp_backend.dto;

import com.smecen.smecenapp_backend.enums.JourneyStatus;

public class JourneyDTO {
    private Integer idJourney;
    private String name;
    private String description;
    private String context;
    private JourneyStatus status;
    private String createdAt;
    private String updatedAt;

    public JourneyDTO() {
    }

    public JourneyDTO(Integer idJourney, String name, String description, String context,
                      JourneyStatus status, String createdAt, String updatedAt) {
        this.idJourney = idJourney;
        this.name = name;
        this.description = description;
        this.context = context;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
