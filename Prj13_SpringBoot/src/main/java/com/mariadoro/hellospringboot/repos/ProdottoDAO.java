package com.mariadoro.hellospringboot.repos;

import com.mariadoro.hellospringboot.entities.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {

}
