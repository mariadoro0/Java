package com.mariadoro.pokemonpics.repo;

import com.mariadoro.pokemonpics.entities.PokemonPic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonPicDAO extends JpaRepository<PokemonPic, String> {
}
