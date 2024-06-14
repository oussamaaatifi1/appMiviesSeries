package com.app.appmoviesseries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
    @GetMapping("/")
    public void Show(){
        System.out.println("welcome");
    }
}
