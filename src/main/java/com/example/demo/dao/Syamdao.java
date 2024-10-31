package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.example.demo.model.Syammouli;

public interface Syamdao extends CrudRepository<Syammouli,Integer>{
    public abstract Syammouli findByDate(String date);
}
