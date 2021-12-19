package com.tftpoolcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alex-DEV on 18/12/2021.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
