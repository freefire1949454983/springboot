package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SyamouliDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketId;
    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    private int seatNumber;
    public SyamouliDetail() {
        super();
    }
    private String date;
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    public SyamouliDetail(int ticketId, int seatNumber, String date, int phonenumber, String name, String destination,
            String fromAddress) {
        TicketId = ticketId;
        this.seatNumber = seatNumber;
        this.date = date;
        this.phonenumber = phonenumber;
        this.name = name;
        this.destination = destination;
        this.fromAddress = fromAddress;
    }
    private int phonenumber;
    private String name;
    
   
    @Override
    public String toString() {
        return "SyamouliDetail [TicketId=" + TicketId + ", seatNumber=" + seatNumber + ", date=" + date
                + ", phonenumber=" + phonenumber + ", name=" + name + ", destination=" + destination + ", fromAddress="
                + fromAddress + "]";
    }
    private String destination;
    private String fromAddress;
    public int getTicketId() {
        return TicketId;
    }
   
    public void setTicketId(int ticketId) {
        TicketId = ticketId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getFromAddress() {
        return fromAddress;
    }
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    

}
