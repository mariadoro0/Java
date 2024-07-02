package com.mariadoro.quizmondo.repos;

import com.mariadoro.quizmondo.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryDAO extends JpaRepository<Country, String> {
    Country findByAlpha2Code(String code);
    Country findByName(String name);
    Country findByCapital(String capital);
    Country findByFlag(String flag);
    List<Country> findByRegion(String region);
    List<Country> findBySubregion(String subregion);

}
