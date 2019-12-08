package com.bsu.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class User {

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Object o) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Object o) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
