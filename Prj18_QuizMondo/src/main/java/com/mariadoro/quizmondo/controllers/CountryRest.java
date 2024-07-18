package com.mariadoro.quizmondo.controllers;


import com.mariadoro.quizmondo.entities.Country;
import com.mariadoro.quizmondo.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class CountryRest {

    @Autowired
    private CountryService service;


    @GetMapping("countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        return new ResponseEntity<List<Country>>(service.getCountries(), HttpStatus.OK);
    }

    @GetMapping("capitals")
    public ResponseEntity<List<String>> getAllCapitals() {
        return new ResponseEntity<List<String>>(service.getCapitals(), HttpStatus.OK);
    }

}
