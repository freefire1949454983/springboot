package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Syammouli {
    
    public Syammouli() {
        super();
    }

    public Syammouli(Integer ticketid, String from, String todes, int one, int two, int three, int four, int five,
            int six, int seven, int eight, int nine, int ten, int eleven, int tweleve, int thirteen, int forteen,
            int sixteen, int seventeen, int eightteen, int nineteen, int twenty, String date) {
        this.ticketid = ticketid;
        this.from = from;
        this.todes = todes;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
        this.ten = ten;
        this.eleven = eleven;
        this.tweleve = tweleve;
        this.thirteen = thirteen;
        this.forteen = forteen;
        this.sixteen = sixteen;
        this.seventeen = seventeen;
        this.eightteen = eightteen;
        this.nineteen = nineteen;
        this.twenty = twenty;
        this.date = date;
    }

    public Syammouli(Syammouli byDate) {
        //TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketid;

    

    @Column(name = "fromLocation") // Changed from 'from' to 'fromLocation'
    private String from;

    public Integer getTicketid() {
        return ticketid;
    }

    @Override
    public String toString() {
        return "Syammouli [ticketid=" + ticketid + ", from=" + from + ", todes=" + todes + ", one=" + one + ", two="
                + two + ", three=" + three + ", four=" + four + ", five=" + five + ", six=" + six + ", seven=" + seven
                + ", eight=" + eight + ", nine=" + nine + ", ten=" + ten + ", eleven=" + eleven + ", tweleve=" + tweleve
                + ", thirteen=" + thirteen + ", forteen=" + forteen + ", sixteen=" + sixteen + ", seventeen="
                + seventeen + ", eightteen=" + eightteen + ", nineteen=" + nineteen + ", twenty=" + twenty + ", date="
                + date + "]";
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
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

    public void setTodes(String todes) {
        this.todes = todes;
    }

    private String todes;

    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getSeven() {
        return seven;
    }

    public void setSeven(int seven) {
        this.seven = seven;
    }

    public int getEight() {
        return eight;
    }

    public void setEight(int eight) {
        this.eight = eight;
    }

    public int getNine() {
        return nine;
    }

    public void setNine(int nine) {
        this.nine = nine;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getEleven() {
        return eleven;
    }

    public void setEleven(int eleven) {
        this.eleven = eleven;
    }

    public int getTweleve() {
        return tweleve;
    }

    public void setTweleve(int tweleve) {
        this.tweleve = tweleve;
    }

    public int getThirteen() {
        return thirteen;
    }

    public void setThirteen(int thirteen) {
        this.thirteen = thirteen;
    }

    public int getForteen() {
        return forteen;
    }

    public void setForteen(int forteen) {
        this.forteen = forteen;
    }

    public int getSixteen() {
        return sixteen;
    }

    public void setSixteen(int sixteen) {
        this.sixteen = sixteen;
    }

    public int getSeventeen() {
        return seventeen;
    }

    public void setSeventeen(int seventeen) {
        this.seventeen = seventeen;
    }

    public int getEightteen() {
        return eightteen;
    }

    public void setEightteen(int eightteen) {
        this.eightteen = eightteen;
    }

    public int getNineteen() {
        return nineteen;
    }

    public void setNineteen(int nineteen) {
        this.nineteen = nineteen;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    private int seven;
    private int eight;
    private int nine;
    private int ten;
    public int getFifteen() {
        return fifteen;
    }

    public void setFifteen(int fifteen) {
        this.fifteen = fifteen;
    }

    private int eleven;
    private int tweleve;
    private int thirteen;
    private int forteen;
    private int fifteen;
    private int sixteen;
    private int seventeen;
    private int eightteen;
    private int nineteen;
    private int twenty;

    @Column(unique = true)
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
