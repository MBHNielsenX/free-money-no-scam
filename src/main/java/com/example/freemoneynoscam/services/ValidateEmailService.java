package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public static boolean isEmailValid(String email){
        //TODO implement logic such that we verify an e-mail is valid
        if (email.contains("@") && email.contains(".")){
            return true;
        } else {
            return false;
        }

    }
}
