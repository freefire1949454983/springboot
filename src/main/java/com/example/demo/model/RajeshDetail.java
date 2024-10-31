package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RajeshDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketId;
    private String date;
   private int seatNumber;
   

    private int phonenumber;
    public RajeshDetail(int ticketId, String date, int seatNumber, int phonenumber, String name, String destination,
            String fromAddress) {
        TicketId = ticketId;
        this.date = date;
        this.seatNumber = seatNumber;
        this.phonenumber = phonenumber;
        this.name = name;
        this.destination = destination;
        this.fromAddress = fromAddress;
    }

    private String name;
    public RajeshDetail() {
        super();
    }
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
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

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "RajeshDetail [TicketId=" + TicketId + ", date=" + date + ", seatNumber=" + seatNumber + ", phonenumber="
                + phonenumber + ", name=" + name + ", destination=" + destination + ", fromAddress=" + fromAddress
                + "]";
    }
    

}
