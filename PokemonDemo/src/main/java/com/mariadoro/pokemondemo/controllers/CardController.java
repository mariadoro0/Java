package com.mariadoro.pokemondemo.controllers;

import com.mariadoro.pokemondemo.entities.Card;
import com.mariadoro.pokemondemo.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pokemon")
public class CardController {
    @Autowired
    private CardService service;

    @GetMapping("allcards")
    public ResponseEntity<List<Card>> getAllCards() {
        return new ResponseEntity<List<Card>>(service.getCards(), HttpStatus.OK);
    }
    @GetMapping("allcards/{name}")
    public ResponseEntity<List<Card>> getByName(@PathVariable String name) {
        return new ResponseEntity<List<Card>>(service.getCardsByName(name), HttpStatus.OK);
    }
    @GetMapping("allcards/search/{type]")
    public ResponseEntity<List<Card>> getByType(@PathVariable String type) {
        return new ResponseEntity<List<Card>>(service.getCardsByType(type), HttpStatus.OK);
    }

}
