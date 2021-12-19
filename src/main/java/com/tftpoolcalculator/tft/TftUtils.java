package com.tftpoolcalculator.tft;

import java.util.List;

/**
 * Created by Alex-DEV on 19/12/2021.
 */
public class TftUtils {


    public static float calculateChances(TftChamps c, List<TftChamps> list, TftChances chances) {
        int poolChance = 100;
        if(c.getCost() == 1)poolChance = chances.getChanceCost1();
        else if(c.getCost() == 2)poolChance = chances.getChanceCost2();
        else if(c.getCost() == 3)poolChance = chances.getChanceCost3();
        else if(c.getCost() == 4)poolChance = chances.getChanceCost4();
        else if(c.getCost() == 5)poolChance = chances.getChanceCost5();

        int totalPool = 0;
        for (TftChamps champ : list){
            if(champ.getCost() == c.getCost()){
                totalPool = totalPool + champ.getPool();
            }
        }
        float chancesInPool = (c.getPool() * 100 )/totalPool;
        float chance = chancesInPool+poolChance/100;
        return chance;
    }
    public static TftChamps searchChamp(String champ, List<TftChamps> list) {
        for (TftChamps c : list){
            if(c.getName().equals(champ)){
                return c;
            }
        }
        return null;
    }

}
