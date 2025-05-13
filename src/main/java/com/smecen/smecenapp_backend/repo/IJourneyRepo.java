package com.smecen.smecenapp_backend.repo;

import com.smecen.smecenapp_backend.model.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJourneyRepo extends IGenericRepo <Journey, Integer> {
}
