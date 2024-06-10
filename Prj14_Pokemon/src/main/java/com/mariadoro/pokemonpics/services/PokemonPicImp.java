package com.mariadoro.pokemonpics.services;

import com.mariadoro.pokemonpics.entities.PokemonData;
import com.mariadoro.pokemonpics.entities.PokemonPic;
import com.mariadoro.pokemonpics.repo.PokemonDataDAO;
import com.mariadoro.pokemonpics.repo.PokemonPicDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PokemonPicImp implements PokemonPicService {
    @Autowired
    private PokemonPicDAO dao;

    @Autowired
    private PokemonDataDAO datadao;

    @Override
    public List<PokemonPic> getPokemonPics() {
        return dao.findAll();
    }

    @Override
    public PokemonPic getPokemonPicByName(String name) {
        for (PokemonPic pokemonPic : dao.findAll()) {
            if (pokemonPic.getName().equalsIgnoreCase(name)) {
                return pokemonPic;
            }
        }
        return null;
    }

    @Override
    public List<PokemonData> getPokemonData() {
        return datadao.findAll();
    }

    @Override
    public PokemonData getPokemonDataByName(String name) {
        for (PokemonData pokemonData : datadao.findAll()) {
            if (pokemonData.getName().equalsIgnoreCase(name)) {
                return pokemonData;
            }
        }
        return null;
    }


}
