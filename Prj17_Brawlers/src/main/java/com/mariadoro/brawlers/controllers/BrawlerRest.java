package com.mariadoro.brawlers.controllers;

import com.mariadoro.brawlers.entities.Brawler;
import com.mariadoro.brawlers.services.BrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class BrawlerRest {

    @Autowired
    private BrawlerService service;

    @GetMapping("brawlers")
    public ResponseEntity<List<Brawler>> getBrawlers() {
        return new ResponseEntity<List<Brawler>>(service.getBrawlers(), HttpStatus.OK);
    }

}
