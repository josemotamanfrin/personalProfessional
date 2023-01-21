package br.com.felipe.personal_professional.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dataPersonal")
public class DataPersonalController {

    @GetMapping(value = "/test1")
    public String test1(){
        return "test1";
    }

    @GetMapping(value = "/test2")
    public String test2(){
        return "test2";
    }
}
