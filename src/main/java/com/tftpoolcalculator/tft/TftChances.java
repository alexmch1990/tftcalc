package com.tftpoolcalculator.tft;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Alex-DEV on 17/12/2021.
 */
@Entity
public class TftChances {
    @Id private int level;
    private int chanceCost1;
    private int chanceCost2;
    private int chanceCost3;
    private int chanceCost4;
    private int chanceCost5;

    public TftChances() {
    }

    public TftChances(int level, int chanceCost1, int chanceCost2, int chanceCost3, int chanceCost4, int chanceCost5) {
        this.level = level;
        this.chanceCost1 = chanceCost1;
        this.chanceCost2 = chanceCost2;
        this.chanceCost3 = chanceCost3;
        this.chanceCost4 = chanceCost4;
        this.chanceCost5 = chanceCost5;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getChanceCost1() {
        return chanceCost1;
    }

    public void setChanceCost1(int chanceCost1) {
        this.chanceCost1 = chanceCost1;
    }

    public int getChanceCost2() {
        return chanceCost2;
    }

    public void setChanceCost2(int chanceCost2) {
        this.chanceCost2 = chanceCost2;
    }

    public int getChanceCost3() {
        return chanceCost3;
    }

    public void setChanceCost3(int chanceCost3) {
        this.chanceCost3 = chanceCost3;
    }

    public int getChanceCost4() {
        return chanceCost4;
    }

    public void setChanceCost4(int chanceCost4) {
        this.chanceCost4 = chanceCost4;
    }

    public int getChanceCost5() {
        return chanceCost5;
    }

    public void setChanceCost5(int chanceCost5) {
        this.chanceCost5 = chanceCost5;
    }
}
