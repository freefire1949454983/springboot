package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.SyamouliDetail;
import java.util.List;


public interface Syamdedao extends CrudRepository<SyamouliDetail,Integer> {
    public abstract List<SyamouliDetail> findByname(String name);
}
