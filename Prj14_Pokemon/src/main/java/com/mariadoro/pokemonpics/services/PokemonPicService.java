package com.mariadoro.pokemonpics.services;

import com.mariadoro.pokemonpics.entities.PokemonData;
import com.mariadoro.pokemonpics.entities.PokemonPic;

import java.util.List;


public interface PokemonPicService {
    List<PokemonPic> getPokemonPics();
    PokemonPic getPokemonPicByName(String name);
    List<PokemonData> getPokemonData();
    PokemonData getPokemonDataByName(String name);
}
