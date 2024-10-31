package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

import com.example.demo.dao.Dao;
import com.example.demo.dao.Rajeshdao;
import com.example.demo.dao.Rajeshdedao;
import com.example.demo.dao.Syamdao;
import com.example.demo.dao.Syamdedao;
import com.example.demo.model.Person;
import com.example.demo.model.Rajesh;
import com.example.demo.model.RajeshDetail;
import com.example.demo.model.Syammouli;
import com.example.demo.model.SyamouliDetail;
import com.example.demo.model.Tempoty;
import com.example.demo.model.Tickettemp;

@Service
public class Ser {
    @Autowired
    private Dao da;

    @Autowired
    private Syamdedao syamdedao;

    @Autowired
    private Rajeshdedao rajeshdedao;

    @Autowired
    private Rajeshdao rajeshdao;

    @Autowired
    private Syamdao syamdao;
    public void cr(Person po){
        da.save(po);
    }
    public Person nm(int id){
        return da.findById(id);
    }

    public void getsyamser(Tempoty tmp){
        Syammouli t1=new Syammouli();
        SyamouliDetail t2=new SyamouliDetail();
        t2.setDestination(tmp.getTodes());
        t2.setFromAddress(tmp.getFrom());
        t2.setName(tmp.getName());
        t2.setPhonenumber(tmp.getPhonenumber());
        t2.setDate(tmp.getDate());
        t2.setSeatNumber(tmp.getSeatNumber());
        syamdedao.save(t2);
        // t1.setFrom(tmp.getFrom());
        // t1.setTodes(tmp.getTodes());
        t1.setDate(tmp.getDate());
        int seat=tmp.getSeatNumber();
        if(seat==1){
            t1.setOne(1);
        }
        else if(seat==2){
            t1.setTwo(1);
        }else if(seat==3){
            t1.setThree(1);
        }else if(seat==4){
            t1.setFour(1);
        }else if(seat==5){
            t1.setFive(1);
        }else if(seat==6){
            t1.setSix(1);
        }else if(seat==7){
            t1.setSeven(1);
        }else if(seat==8){
            t1.setEight(1);
        }else if(seat==9){
            t1.setNine(1);
        }else if(seat==10){
            t1.setTen(1);
        }else if(seat==11){
            t1.setEleven(1);
        }else if(seat==12){
            t1.setTweleve(1);
        }else if(seat==13){
            t1.setThirteen(1);
        }else if(seat==14){
            t1.setForteen(1);
        }else if(seat==15){
            t1.setFifteen(1);
        }else if(seat==16){
            t1.setSixteen(1);
        }else if(seat==17){
            t1.setSeventeen(1);
        }else if(seat==18){
            t1.setEightteen(1);
        }else if(seat==19){
            t1.setNineteen(1);
        }else if(seat==20){
            t1.setTwenty(seat);
        }

        Syammouli t12=syamdao.findByDate(tmp.getDate());
        if (t12 == null) {
            // Insert new record as it doesn't exist in the database
            syamdao.save(t1);
        } else {
            // Update existing record instead of inserting a new one
            t12.setFrom(tmp.getFrom()); // Example of updating field(s)
            t12.setTodes(tmp.getTodes()); // Add other fields you need to update
            int set=tmp.getSeatNumber();
        if(set==1){
            t12.setOne(1);
        }
        else if(set==2){
            t12.setTwo(1);
        }else if(set==3){
            t12.setThree(1);
        }else if(set==4){
            t12.setFour(1);
        }else if(set==5){
            t12.setFive(1);
        }else if(set==6){
            t12.setSix(1);
        }else if(set==7){
            t12.setSeven(1);
        }else if(set==8){
            t12.setEight(1);
        }else if(set==9){
            t12.setNine(1);
        }else if(set==10){
            t12.setTen(1);
        }else if(set==11){
            t12.setEleven(1);
        }else if(set==12){
            t12.setTweleve(1);
        }else if(set==13){
            t12.setThirteen(1);
        }else if(set==14){
            t12.setForteen(1);
        }else if(set==15){
            t12.setFifteen(1);
        }else if(set==16){
            t12.setSixteen(1);
        }else if(set==17){
            t12.setSeventeen(1);
        }else if(set==18){
            t12.setEightteen(1);
        }else if(set==19){
            t12.setNineteen(1);
        }else if(set==20){
            t12.setTwenty(seat);
        }
            // Save the updated entity
            syamdao.save(t12);
        }
    }

    public void getraje(Tempoty tmp){
        Rajesh t1=new Rajesh();
        // t1.setFrom(tmp.getFrom());
        // t1.setTodes(tmp.getTodes());
        t1.setDate(tmp.getDate());
        RajeshDetail t2=new RajeshDetail();
        t2.setDestination(tmp.getTodes());
        t2.setFromAddress(tmp.getFrom());
        t2.setName(tmp.getName());
        t2.setPhonenumber(tmp.getPhonenumber());
        t2.setDate(tmp.getDate());
        t2.setSeatNumber(tmp.getSeatNumber());
        rajeshdedao.save(t2);
        int seat=tmp.getSeatNumber();
        if(seat==1){
            t1.setOne(1);
        }
        else if(seat==2){
            t1.setTwo(1);
        }else if(seat==3){
            t1.setThree(1);
        }else if(seat==4){
            t1.setFour(1);
        }else if(seat==5){
            t1.setFive(1);
        }else if(seat==6){
            t1.setSix(1);
        }else if(seat==7){
            t1.setSeven(1);
        }else if(seat==8){
            t1.setEight(1);
        }else if(seat==9){
            t1.setNine(1);
        }else if(seat==10){
            t1.setTen(1);
        }else if(seat==11){
            t1.setEleven(1);
        }else if(seat==12){
            t1.setTweleve(1);
        }else if(seat==13){
            t1.setThirteen(1);
        }else if(seat==14){
            t1.setForteen(1);
        }else if(seat==15){
            t1.setFifteen(1);
        }else if(seat==16){
            t1.setSixteen(1);
        }else if(seat==17){
            t1.setSeventeen(1);
        }else if(seat==18){
            t1.setEightteen(1);
        }else if(seat==19){
            t1.setNineteen(1);
        }else if(seat==20){
            t1.setTwenty(seat);
        }

        Rajesh t12=rajeshdao.findByDate(tmp.getDate());
        if (t12 == null) {
            // Insert new record as it doesn't exist in the database
            rajeshdao.save(t1);
        } else {
            // Update existing record instead of inserting a new one
            t12.setFrom(tmp.getFrom()); // Example of updating field(s)
            t12.setTodes(tmp.getTodes()); // Add other fields you need to update
            int set=tmp.getSeatNumber();
        if(set==1){
            t12.setOne(1);
        }
        else if(set==2){
            t12.setTwo(1);
        }else if(set==3){
            t12.setThree(1);
        }else if(set==4){
            t12.setFour(1);
        }else if(set==5){
            t12.setFive(1);
        }else if(set==6){
            t12.setSix(1);
        }else if(set==7){
            t12.setSeven(1);
        }else if(set==8){
            t12.setEight(1);
        }else if(set==9){
            t12.setNine(1);
        }else if(set==10){
            t12.setTen(1);
        }else if(set==11){
            t12.setEleven(1);
        }else if(set==12){
            t12.setTweleve(1);
        }else if(set==13){
            t12.setThirteen(1);
        }else if(set==14){
            t12.setForteen(1);
        }else if(set==15){
            t12.setFifteen(1);
        }else if(set==16){
            t12.setSixteen(1);
        }else if(set==17){
            t12.setSeventeen(1);
        }else if(set==18){
            t12.setEightteen(1);
        }else if(set==19){
            t12.setNineteen(1);
        }else if(set==20){
            t12.setTwenty(seat);
        }
            // Save the updated entity
            rajeshdao.save(t12);
        }
    }

    public Tickettemp getsyambusdate(String date){
        Syammouli d1=syamdao.findByDate(date);
        Tickettemp t1=new Tickettemp();
        if(d1==null) return t1;
        t1.setOne(d1.getOne());
        t1.setTwo(d1.getTwo());
        t1.setThree(d1.getThree());
        t1.setFour(d1.getFour());
        t1.setFive(d1.getFive());
        t1.setSix(d1.getSix());
        t1.setSeven(d1.getSeven());
        t1.setEight(d1.getEight());
        t1.setNine(d1.getNine());
        t1.setTen(d1.getTen());
        t1.setEleven(d1.getEleven());
        t1.setTweleve(d1.getTweleve());
        t1.setThirteen(d1.getThirteen());
        t1.setForteen(d1.getForteen());
        t1.setFifteen(d1.getFifteen());
        t1.setSixteen(d1.getSixteen());
        t1.setSeventeen(d1.getSeventeen());
        t1.setEightteen(d1.getEightteen());
        t1.setNineteen(d1.getNineteen());
        t1.setTwenty(d1.getTwenty());
        return t1;
    }
    public Tickettemp getrajeshbusdate(String date){
        Rajesh d1=rajeshdao.findByDate(date);
        Tickettemp t1=new Tickettemp();
        if(d1==null) return t1;
        t1.setOne(d1.getOne());
        t1.setTwo(d1.getTwo());
        t1.setThree(d1.getThree());
        t1.setFour(d1.getFour());
        t1.setFive(d1.getFive());
        t1.setSix(d1.getSix());
        t1.setSeven(d1.getSeven());
        t1.setEight(d1.getEight());
        t1.setNine(d1.getNine());
        t1.setTen(d1.getTen());
        t1.setEleven(d1.getEleven());
        t1.setTweleve(d1.getTweleve());
        t1.setThirteen(d1.getThirteen());
        t1.setForteen(d1.getForteen());
        t1.setFifteen(d1.getFifteen());
        t1.setSixteen(d1.getSixteen());
        t1.setSeventeen(d1.getSeventeen());
        t1.setEightteen(d1.getEightteen());
        t1.setNineteen(d1.getNineteen());
        t1.setTwenty(d1.getTwenty());
        System.out.println();
        return t1;
    }
    public List<Tempoty> getalltickets(String name){
        
     List<RajeshDetail> tem=rajeshdedao.findByname(name);
     List<SyamouliDetail> tem1=syamdedao.findByname(name);
     List<Tempoty> temporarytempo=new ArrayList<>();
     for (RajeshDetail tm1:tem) {
        Tempoty tt=new Tempoty();
        tt.setSeatNumber(tm1.getSeatNumber());
        tt.setDate(tm1.getDate());
        tt.setFrom(tm1.getFromAddress());
        tt.setName(tm1.getName());
        tt.setPhonenumber(tm1.getSeatNumber());
        tt.setTodes(tm1.getDestination());
        tt.setSelectedBus(2);
        temporarytempo.add(tt);
        
     }
     for (SyamouliDetail tm1:tem1) {
        Tempoty tt=new Tempoty();
        tt.setSeatNumber(tm1.getSeatNumber());
        tt.setDate(tm1.getDate());
        tt.setFrom(tm1.getFromAddress());
        tt.setName(tm1.getName());
        tt.setPhonenumber(tm1.getSeatNumber());
        tt.setTodes(tm1.getDestination());
        tt.setSelectedBus(1);
        temporarytempo.add(tt);
        
     }
     System.out.println(tem);
     System.out.println(tem1);
            return temporarytempo;
    }
}
