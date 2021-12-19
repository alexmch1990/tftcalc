package com.tftpoolcalculator.tft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alex-DEV on 19/12/2021.
 */
@Service
public class TftService {
    @Autowired
    TftChampsRepository tftChampsRepository;

    @Autowired
    TftChancesRepository tftChancesRepository;

    public List<TftChamps> getTftChamps (){
        return tftChampsRepository.findAll();
    }
    public float getChancesChampsPerLevel(String champ, int level){

        List<TftChamps> list = tftChampsRepository.findAll();
        TftChamps c = TftUtils.searchChamp(champ, list);

        TftChances chances = tftChancesRepository.getById(level);
        return TftUtils.calculateChances(c,list,chances);
    }









}
