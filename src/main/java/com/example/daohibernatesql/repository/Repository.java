package com.example.daohibernatesql.repository;

import com.example.daohibernatesql.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> personsList(String city) {
        return entityManager.createQuery("SELECT p FROM Persons p WHERE p.cityOfLiving = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}
