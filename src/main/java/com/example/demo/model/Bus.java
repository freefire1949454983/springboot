package com.example.demo.model;

import org.springframework.aot.generate.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buid;


    private String Busname;

    private int Busprice;

    public int getBuid() {
        return buid;
    }

    public Bus() {
        super();
    }

    public Bus(int buid, String busname, int busprice, String busemail) {
        this.buid = buid;
        Busname = busname;
        Busprice = busprice;
        Busemail = busemail;
    }

    @Override
    public String toString() {
        return "Bus [buid=" + buid + ", Busname=" + Busname + ", Busprice=" + Busprice + ", Busemail=" + Busemail + "]";
    }

    public void setBuid(int buid) {
        this.buid = buid;
    }

    public String getBusname() {
        return Busname;
    }

    public void setBusname(String busname) {
        Busname = busname;
    }

    public int getBusprice() {
        return Busprice;
    }

    public void setBusprice(int busprice) {
        Busprice = busprice;
    }

    public String getBusemail() {
        return Busemail;
    }

    public void setBusemail(String busemail) {
        Busemail = busemail;
    }

    private String Busemail;
    
}
