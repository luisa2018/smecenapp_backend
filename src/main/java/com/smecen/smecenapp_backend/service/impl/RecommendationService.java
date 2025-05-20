package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.dto.InfrastructureDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecommendationService {
    public List<String> generarRecomendaciones(InfrastructureDTO dto) {
        List<String> recomendaciones = new ArrayList<>();

        if (dto.getEnvironmentTypes() != null && dto.getEnvironmentTypes().contains("prod")) {
            recomendaciones.add("Para producción considera instancias reservadas para reducir costos.");
        }

        if (dto.getComputeServices() != null && dto.getComputeServices().contains("ec2")) {
            recomendaciones.add("EC2: activa auto scaling y configura alarmas para evitar sobrecosto.");
        }

        if (dto.getDatabaseServices() != null && dto.getDatabaseServices().contains("dynamo")) {
            recomendaciones.add("DynamoDB: considera el modo bajo demanda si el tráfico es variable.");
        }

        // ... puedes seguir ampliando con base en tus reglas

        return recomendaciones;
    }
}


