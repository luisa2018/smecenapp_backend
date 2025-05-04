package com.smecen.smecenapp_backend.controller;

import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/journeys")
public class JourneyController {

    @Autowired
    private IJourneyService service;
    @PostMapping
    public Journey registrar(@RequestBody Journey j) throws Exception{
        return service.register(j);
    }


}
