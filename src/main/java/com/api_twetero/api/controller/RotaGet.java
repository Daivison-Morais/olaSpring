package com.api_twetero.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/get")
public class RotaGet {

    @GetMapping
    public String ola() {
        return "Olá Spring";
    }

}
