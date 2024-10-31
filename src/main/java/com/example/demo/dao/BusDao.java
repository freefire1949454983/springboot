package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Bus;

public interface BusDao extends CrudRepository<Bus,Integer>{
    
}
