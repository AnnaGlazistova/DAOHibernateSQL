package com.example.daohibernatesql.service;

import com.example.daohibernatesql.entity.Persons;
import com.example.daohibernatesql.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Persons> personsList(String city) {
        return repository.personsList(city);

    }
}