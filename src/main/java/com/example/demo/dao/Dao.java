package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
// import java.util.List;


@Repository
public interface Dao extends CrudRepository<Person,Integer>{
    // public Iterable<Person> findAll
    public Person findById(int id);
}
// controller -> service -> dao -> model
