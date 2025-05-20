package com.smecen.smecenapp_backend.controller;

import com.smecen.smecenapp_backend.dto.FinancialGoalDTO;
import com.smecen.smecenapp_backend.exception.ModelNotFoundException;
import com.smecen.smecenapp_backend.model.FinancialGoal;
import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.service.IFinancialGoalService;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/financial-goals")
public class FinancialGoalController {
    @Autowired
    private IFinancialGoalService service;

    @Autowired
    private IJourneyService journeyService;

    @Autowired
    private ModelMapper modelMapper;

    // ✅ POST - Crear nuevo FinancialGoal
    @PostMapping
    public ResponseEntity<FinancialGoalDTO> register(@RequestBody FinancialGoalDTO dto) throws Exception {
        Journey journey = journeyService.listToId(dto.getJourneyId());
        if (journey == null) {
            throw new ModelNotFoundException("Journey no encontrado con id: " + dto.getJourneyId());
        }

        FinancialGoal goal = modelMapper.map(dto, FinancialGoal.class);
        goal.setJourney(journey);

        FinancialGoal saved = service.register(goal);
        return ResponseEntity.ok(modelMapper.map(saved, FinancialGoalDTO.class));
    }

    // ✅ GET - Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<FinancialGoalDTO> getById(@PathVariable("id") Integer id) throws Exception {
        FinancialGoal goal = service.listToId(id);
        if (goal == null) {
            return ResponseEntity.notFound().build();
        }

        FinancialGoalDTO dto = modelMapper.map(goal, FinancialGoalDTO.class);
        dto.setJourneyId(goal.getJourney().getIdJourney());
        return ResponseEntity.ok(dto);
    }

    // ✅ PUT - Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<FinancialGoalDTO> update(@PathVariable("id") Integer id, @RequestBody FinancialGoalDTO dto) throws Exception {
        FinancialGoal existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        Journey journey = journeyService.listToId(dto.getJourneyId());
        if (journey == null) {
            throw new ModelNotFoundException("Journey no encontrado con id: " + dto.getJourneyId());
        }

        FinancialGoal updatedEntity = modelMapper.map(dto, FinancialGoal.class);
        updatedEntity.setId(id); // forzar el ID
        updatedEntity.setJourney(journey);

        FinancialGoal updated = service.update(updatedEntity);
        return ResponseEntity.ok(modelMapper.map(updated, FinancialGoalDTO.class));
    }

    // ✅ DELETE - Eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        FinancialGoal existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
