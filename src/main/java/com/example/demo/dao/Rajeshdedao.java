package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.RajeshDetail;
import java.util.List;


public interface Rajeshdedao extends CrudRepository<RajeshDetail,Integer>{
    public abstract List<RajeshDetail> findByname(String name);
}
