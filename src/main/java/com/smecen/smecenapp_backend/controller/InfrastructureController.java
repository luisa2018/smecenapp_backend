package com.smecen.smecenapp_backend.controller;

import com.smecen.smecenapp_backend.dto.InfrastructureDTO;
import com.smecen.smecenapp_backend.model.Infrastructure;
import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.service.IInfrastructureService;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/infrastructure")
public class InfrastructureController {
    @Autowired
    private IInfrastructureService service;

    @Autowired
    private IJourneyService journeyService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public InfrastructureDTO register(@RequestBody InfrastructureDTO dto) throws Exception {
        Infrastructure entity = modelMapper.map(dto, Infrastructure.class);


        if (dto.getJourneyId() != null) {
            Journey journey = journeyService.listToId(dto.getJourneyId());

            if (journey == null) {
                throw new IllegalArgumentException("Journey no encontrado con id: " + dto.getJourneyId());
            }

            entity.setJourney(journey);
        } else {
            throw new IllegalArgumentException("JourneyId es obligatorio");
        }

        Infrastructure saved = service.register(entity);
        return modelMapper.map(saved, InfrastructureDTO.class);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InfrastructureDTO> getById(@PathVariable("id") Integer id) throws Exception {
        Infrastructure infra = service.listToId(id);
        if (infra == null) {
            return ResponseEntity.notFound().build();
        }
        InfrastructureDTO dto = modelMapper.map(infra, InfrastructureDTO.class);
        dto.setJourneyId(infra.getJourney().getIdJourney());
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<InfrastructureDTO>> getAll() throws Exception {
        List<InfrastructureDTO> list = service.list().stream()
                .map(i -> modelMapper.map(i, InfrastructureDTO.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(list);
    }


    @PutMapping("/{id}")
    public ResponseEntity<InfrastructureDTO> update(@PathVariable("id") Integer id, @RequestBody InfrastructureDTO dto) throws Exception {
        Infrastructure existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        Infrastructure updatedEntity = modelMapper.map(dto, Infrastructure.class);


        updatedEntity.setId(id);


        Journey journey = new Journey();
        journey.setIdJourney(dto.getJourneyId());
        updatedEntity.setJourney(journey);

        Infrastructure updated = service.update(updatedEntity);
        InfrastructureDTO responseDTO = modelMapper.map(updated, InfrastructureDTO.class);
        responseDTO.setJourneyId(updated.getJourney().getIdJourney());

        return ResponseEntity.ok(responseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        Infrastructure existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
