package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Rajesh;


public interface Rajeshdao extends CrudRepository<Rajesh,Integer>{
    public abstract Rajesh findByDate(String from);
}
