package com.mariadoro.pokemonpics.repo;

import com.mariadoro.pokemonpics.entities.PokemonData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonDataDAO extends JpaRepository<PokemonData, Integer> {
}
