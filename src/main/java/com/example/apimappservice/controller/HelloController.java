package com.example.apimappservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String index() {
        return "Greetings Rohan!";
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){

        return new ResponseEntity<>("Hey Testing", HttpStatus.OK);
    }


    @GetMapping("/api/employees/{id}/{name}")
    public ResponseEntity<String> getEmployeesByIdAndName(@PathVariable String id, @PathVariable String name) {

        return  new ResponseEntity<>(("ID: " + id + ", name: " + name), HttpStatus.OK);

    }

    @GetMapping("/api/foos")
    public ResponseEntity<String> getFoos(@RequestParam String id) {
        return  new ResponseEntity<>("ID: " + id,HttpStatus.ACCEPTED);
    }

}
