package com.dev.springboot_multiple_database;

import com.dev.springboot_multiple_database.util.StringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMultipleDatabaseApplication {

    public static void main(String[] args) {
        String profile = StringUtil.nvl(System.getProperty("spring.profiles.active"), "local");
        System.setProperty("spring.profiles.active", profile);
        System.setProperty("service.name", "springboot_multiple_database");
        SpringApplication.run(SpringbootMultipleDatabaseApplication.class, args);
    }

}
