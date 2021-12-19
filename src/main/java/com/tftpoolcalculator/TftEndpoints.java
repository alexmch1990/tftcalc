package com.tftpoolcalculator;

import com.tftpoolcalculator.tft.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Alex-DEV on 17/12/2021.
 */
@RestController
public class TftEndpoints {
    @Autowired
    TftService tftService;

    @RequestMapping(value = "/getChances", method = RequestMethod.GET)
    float getChancesChampsPerLevel(@RequestParam String champ, @RequestParam int level){
        return tftService.getChancesChampsPerLevel(champ, level);
    }
    @RequestMapping(value = "/getChamps", method = RequestMethod.GET)
    List<TftChamps> getChancesChampsPerLevel(){
        return tftService.getTftChamps();
    }



}
