package com.tftpoolcalculator;

import com.tftpoolcalculator.tft.TftChamps;
import com.tftpoolcalculator.tft.TftChampsRepository;
import com.tftpoolcalculator.tft.TftChances;
import com.tftpoolcalculator.tft.TftChancesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Alex-DEV on 17/12/2021.
 */
@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabaseChamps(final TftChampsRepository repositoryChamps){
        return args -> {
            repositoryChamps.save(new TftChamps("Caitlyn",1));
            repositoryChamps.save(new TftChamps("Camille",1));
            repositoryChamps.save(new TftChamps("Darius",1));
            repositoryChamps.save(new TftChamps("Ezreal",1));
            repositoryChamps.save(new TftChamps("Garen",1));
            repositoryChamps.save(new TftChamps("Graves",1));
            repositoryChamps.save(new TftChamps("Illaoi",1));
            repositoryChamps.save(new TftChamps("Kassadin",1));
            repositoryChamps.save(new TftChamps("Poppy",1));
            repositoryChamps.save(new TftChamps("Singed",1));
            repositoryChamps.save(new TftChamps("Twisted Fate",1));
            repositoryChamps.save(new TftChamps("Twitch",1));
            repositoryChamps.save(new TftChamps("Ziggs",1));

            repositoryChamps.save(new TftChamps("Blitzcrank",2));
            repositoryChamps.save(new TftChamps("Katarina",2));
            repositoryChamps.save(new TftChamps("KogMaw",2));
            repositoryChamps.save(new TftChamps("Lulu",2));
            repositoryChamps.save(new TftChamps("Quinn",2));
            repositoryChamps.save(new TftChamps("Swain",2));
            repositoryChamps.save(new TftChamps("Talon",2));
            repositoryChamps.save(new TftChamps("Tristana",2));
            repositoryChamps.save(new TftChamps("Trundle",2));
            repositoryChamps.save(new TftChamps("Vi",2));
            repositoryChamps.save(new TftChamps("Warwick",2));
            repositoryChamps.save(new TftChamps("Zilean",2));
            repositoryChamps.save(new TftChamps("Zyra",2));

            repositoryChamps.save(new TftChamps("Chogath",3));
            repositoryChamps.save(new TftChamps("Ekko",3));
            repositoryChamps.save(new TftChamps("Gangplank",3));
            repositoryChamps.save(new TftChamps("Heimerdinger",3));
            repositoryChamps.save(new TftChamps("Leona",3));
            repositoryChamps.save(new TftChamps("Lissandra",3));
            repositoryChamps.save(new TftChamps("Malzahar",3));
            repositoryChamps.save(new TftChamps("Miss Fortune",3));
            repositoryChamps.save(new TftChamps("Samira",3));
            repositoryChamps.save(new TftChamps("Shaco",3));
            repositoryChamps.save(new TftChamps("Taric",3));
            repositoryChamps.save(new TftChamps("Vex",3));
            repositoryChamps.save(new TftChamps("Zac",3));

            repositoryChamps.save(new TftChamps("Braum",4));
            repositoryChamps.save(new TftChamps("Dr.Mundo",4));
            repositoryChamps.save(new TftChamps("Fiora",4));
            repositoryChamps.save(new TftChamps("Janna",4));
            repositoryChamps.save(new TftChamps("Jhin",4));
            repositoryChamps.save(new TftChamps("Lux",4));
            repositoryChamps.save(new TftChamps("Orianna",4));
            repositoryChamps.save(new TftChamps("Seraphine",4));
            repositoryChamps.save(new TftChamps("Sion",4));
            repositoryChamps.save(new TftChamps("Urgot",4));
            repositoryChamps.save(new TftChamps("Yone",4));

            repositoryChamps.save(new TftChamps("Akali",5));
            repositoryChamps.save(new TftChamps("Galio",5));
            repositoryChamps.save(new TftChamps("Jayce",5));
            repositoryChamps.save(new TftChamps("Jinx",5));
            repositoryChamps.save(new TftChamps("Kaisa",5));
            repositoryChamps.save(new TftChamps("Tham Kench",5));
            repositoryChamps.save(new TftChamps("Viktor",5));
            repositoryChamps.save(new TftChamps("Yummi",5));
        };
    }
    @Bean
    CommandLineRunner initDatabaseChances(final TftChancesRepository repositoryChances) {
        return args -> {
            repositoryChances.save(new TftChances(1,100,0,0,0,0));
            repositoryChances.save(new TftChances(2,100,0,0,0,0));
            repositoryChances.save(new TftChances(3,75,25,0,0,0));
            repositoryChances.save(new TftChances(4,55,30,15,0,0));
            repositoryChances.save(new TftChances(5,45,33,20,2,0));
            repositoryChances.save(new TftChances(6,25,40,30,5,0));
            repositoryChances.save(new TftChances(7,19,30,35,15,1));
            repositoryChances.save(new TftChances(8,15,20,35,25,5));
            repositoryChances.save(new TftChances(9,10,15,30,30,15));
        };
    }
}
