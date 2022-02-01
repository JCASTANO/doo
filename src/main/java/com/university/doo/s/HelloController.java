package com.university.doo.s;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {

        String greeting = "Hello default mode";

        LocalDate currentDate = LocalDate.now();

        if(currentDate.getDayOfMonth() >= 1) {
            greeting = "Hello first mode.";
        }

        if(currentDate.getDayOfMonth() > 5) {
            greeting = "Hello second mode";
        }

        //acá se guarda el saludo en la base de datos

        return ResponseEntity.ok(greeting);
    }
}
