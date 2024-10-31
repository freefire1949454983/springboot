package com.example.demo.contr;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BusDao;
import com.example.demo.dao.Dao;
import com.example.demo.dao.Rajeshdedao;
import com.example.demo.dao.Syamdao;
import com.example.demo.model.Bus;
import com.example.demo.model.Person;
import com.example.demo.model.RajeshDetail;
import com.example.demo.model.Syammouli;
import com.example.demo.model.Tempoty;
import com.example.demo.model.Tickettemp;
import com.example.demo.service.Ser;

import org.hibernate.engine.internal.Collections;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping(value = "/book")
public class Controller {
    @Autowired
    private Dao ds;

    @Autowired
    private BusDao busDao;

    @Autowired
    private Ser ser;

    @Autowired
    private Syamdao syamdao;
    // @Autowired
    // private Tempoty tempoty;

    @Autowired 
    private Rajeshdedao rajeshdedao;
    @PostMapping("/create")
    public void gh(@RequestBody Person perr){
        System.out.println(perr.toString());
        ds.save(perr);
    }

    @GetMapping("/getbusdetail/{selectedBus}/{date}")
    public Tickettemp getBusDetail(
            @PathVariable Integer selectedBus, 
            @PathVariable String date) {
        // System.out.println(temp.getSelectedBus()+"  "+temp.getSelectedBus()=="1");
        System.out.println("iam ");
        if(selectedBus==1){
            System.out.println(date);
            return ser.getsyambusdate(date);
        }
        else if(selectedBus==2){
            System.out.println(date);
            return ser.getrajeshbusdate(date);
        }
        return new Tickettemp();
    }
    
    @PostMapping("/createBus")
    public void gh(@RequestBody Tempoty temp){
       System.out.println(temp.toString());
       if(temp.getSelectedBus()==1){
        ser.getsyamser(temp);
       }
       else ser.getraje(temp);
    }
    @GetMapping("/bus")
    public Iterable<Bus> getallbus() {
        return busDao.findAll();
    }

    @GetMapping("/getmyticket/{name}")
    public List<Tempoty> getMethodName(@PathVariable String name) {
        return ser.getalltickets(name);
    }
    @GetMapping("/getrajeshmyticket/{name}")
    public List<RajeshDetail> getMethodNamqe(@PathVariable String name) {
        return rajeshdedao.findByname(name);
    }
    
    // @GetMapping("path")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    
    // public Person hj(@Re)

    @GetMapping("/get")
    public Iterable<Person> find(){
        return ds.findAll();
    }
    
}
