package com.example.demo.model;

// @Component
public class Tempoty {
    

    private int selectedBus;

    public int getSelectedBus() {
        return selectedBus;
    }

    public void setSelectedBus(int selectedBus) {
        this.selectedBus = selectedBus;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTodes() {
        return todes;
    }

    @Override
    public String toString() {
        return "Tempoty [selectedBus=" + selectedBus + ", from=" + from + ", todes=" + todes + ", phonenumber="
                + phonenumber + ", name=" + name + ", seatNumber=" + seatNumber + ", date=" + date + "]";
    }

    public void setTodes(String todes) {
        this.todes = todes;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Tempoty() {
        super();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   // (int ticketId, String date, int seatNumber, int phonenumber, String name, String destination,
   // String fromAddress) 
    public Tempoty(int selectedBus, String from, String todes, int phonenumber, String name, int seatNumber,
            String date) {
        this.selectedBus = selectedBus;
        this.from = from;
        this.todes = todes;
        this.phonenumber = phonenumber;
        this.name = name;
        this.seatNumber = seatNumber;
        this.date = date;
    }

    private String from;

    private String todes;

    private int phonenumber;
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int seatNumber;

    private String date;
    
}
