package com.example.daohibernatesql.controller;

import com.example.daohibernatesql.entity.Persons;
import com.example.daohibernatesql.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> personsList(@RequestParam("city") String city) {
        return service.personsList(city);
    }
}