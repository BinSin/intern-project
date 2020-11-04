package com.humuson.intern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String showLogin(@RequestParam(value="error", required=false) String error, Model model) {

        if(error != null) {
            model.addAttribute("errorMsg", "Invalid username and password");
        }
        return "login";
    }

}
