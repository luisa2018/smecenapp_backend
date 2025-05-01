package com.smecen.smecenapp_backend.repository;

import com.smecen.smecenapp_backend.model.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJourneyRepo extends JpaRepository<Journey, Integer> {
}
