package com.tftpoolcalculator.tft;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


/**
 * Created by Alex-DEV on 17/12/2021.
 */
@Entity
public class TftChamps {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int cost;
    private int pool;

    public TftChamps() {
    }

    public TftChamps(String name, int cost){
        int pool = 0;
        if(cost == 1) pool = 29;
        else if(cost == 2) pool = 22;
        else if(cost == 3) pool = 18;
        else if(cost == 4) pool = 12;
        else if(cost == 5) pool = 10;
        this.name = name;
        this.cost = cost;
        this.pool = pool;
    }

    public TftChamps(String name, int cost, int pool) {
        this.name = name;
        this.cost = cost;
        this.pool = pool;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
