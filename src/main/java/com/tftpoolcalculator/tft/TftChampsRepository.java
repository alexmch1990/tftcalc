package com.tftpoolcalculator.tft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alex-DEV on 17/12/2021.
 */
@Repository
public interface TftChampsRepository extends JpaRepository<TftChamps, Long> {

}
