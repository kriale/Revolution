package com.bsu.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shops")
public class Shop {

    @GetMapping
    public ResponseEntity<Void> getShop() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/filters")
    public ResponseEntity<List<Object>> getByFilter(@RequestParam int price) {
        System.out.println(price);
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Object o){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Object o) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}