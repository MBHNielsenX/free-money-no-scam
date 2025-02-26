package com.example.freemoneynoscam;

import com.example.freemoneynoscam.jdbc_data.JdbcNoScam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreeMoneyNoScamApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeMoneyNoScamApplication.class, args);
        JdbcNoScam.connectToDB();
    }

}
