package com.mariadoro.pokemonpics.controllers;

import com.mariadoro.pokemonpics.entities.PokemonData;
import com.mariadoro.pokemonpics.entities.PokemonPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mariadoro.pokemonpics.services.PokemonPicService;

import java.util.List;

@RestController
public class PokemonPicREST {

    @Autowired
    private PokemonPicService service;


    @GetMapping("pokemon-pics")
    List<PokemonPic> getPokemonPics() {
        return service.getPokemonPics();
    }

    @GetMapping("pokemon-pics/{name}")
    PokemonPic getPokemonPicByName (@PathVariable String name) {
        return service.getPokemonPicByName(name);
    }

    @GetMapping("pokemon-data")
    List<PokemonData> getPokemonData () {
        return service.getPokemonData();
    }

    @GetMapping("pokemon-data/{name}")
    PokemonData getPokemonDataByName (@PathVariable String name) {
        return service.getPokemonDataByName(name);
    }



}

