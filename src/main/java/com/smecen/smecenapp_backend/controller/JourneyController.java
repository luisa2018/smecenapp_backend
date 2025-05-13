package com.smecen.smecenapp_backend.controller;

import com.smecen.smecenapp_backend.dto.JourneyDTO;
import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/journeys")
public class JourneyController {

    @Autowired
    private IJourneyService service;

    @Autowired
    private ModelMapper mapper;

    // Crear un nuevo Journey
    @PostMapping
    public ResponseEntity<JourneyDTO> register(@RequestBody JourneyDTO dto) throws Exception {
        Journey journey = mapper.map(dto, Journey.class);
        Journey saved = service.register(journey);
        return ResponseEntity.ok(mapper.map(saved, JourneyDTO.class));
    }

    // Obtener un Journey por ID
    @GetMapping("/{id}")
    public ResponseEntity<JourneyDTO> getById(@PathVariable("id") Integer id) throws Exception {
        Journey journey = service.listToId(id);
        if (journey == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mapper.map(journey, JourneyDTO.class));
    }

    // Listar todos los Journeys
    @GetMapping
    public ResponseEntity<List<JourneyDTO>> getAll() throws Exception {
        List<JourneyDTO> list = service.list().stream()
                .map(j -> mapper.map(j, JourneyDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }

    // Actualizar un Journey
    @PutMapping("/{id}")
    public ResponseEntity<JourneyDTO> update(@PathVariable("id") Integer id, @RequestBody JourneyDTO dto) throws Exception {
        Journey existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        Journey updatedEntity = mapper.map(dto, Journey.class);
        updatedEntity.setIdJourney(id); // asegurar ID correcto
        Journey updated = service.update(updatedEntity);

        return ResponseEntity.ok(mapper.map(updated, JourneyDTO.class));
    }

    // Eliminar un Journey
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        Journey existing = service.listToId(id);
        if (existing == null) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
