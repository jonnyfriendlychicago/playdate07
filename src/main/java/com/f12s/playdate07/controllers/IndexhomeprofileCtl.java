package com.f12s.playdate07.controllers;

//public class IndexhomeprofileCtl {
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexhomeprofileCtl {
    @GetMapping(value = {"/", "/home"})
    public String displayHome(
    ) {

        return "home.jsp";
    }
}