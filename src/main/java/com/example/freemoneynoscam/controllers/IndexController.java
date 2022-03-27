package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.jdbc_data.JdbcNoScam;
import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/correctMail")
    public String succesMail(){
        return "mailSucceded";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        System.out.println(dataFromForm.getParameter("email"));
        String email = dataFromForm.getParameter("email");

        if (ValidateEmailService.isEmailValid(email)) {
            JdbcNoScam.insertData(email);
            return "redirect:/correctMail";
        } else {
            return "redirect:/";
        }

    }
}
