package com.dev.springboot_multiple_database.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String getMessage(String msg) {

        return "return " + msg + "by mainService";
    }

}
