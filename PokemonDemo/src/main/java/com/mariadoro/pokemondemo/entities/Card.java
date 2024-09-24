package com.mariadoro.pokemondemo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;
@Entity
public class Card {
    @Id
    private String id;
    private String set;
    private String series;
    private String publisher;
    private Date releaseDate;
    private String artist;
    private String name;
    private String set_num;
    @ElementCollection
    private List<String> types;
    private String supertype;
    @ElementCollection
    private List<String> subtypes;
    private Integer level;
    private Integer hp;
    private String evolvesFrom;
    @ElementCollection
    private List<String> evolvesTo;
    @JsonFormat
    private String abilities;
    @JsonFormat
    private String attacks;
    @JsonFormat
    private String weaknesses;
    @ElementCollection
    private List<String> retreatCost;
    private Integer convertedRetreatCost;
    private String rarity;
    private String flavorText;
    @ElementCollection
    private List<Integer> nationalPokedexNumbers;
    @JsonFormat
    private String legalities;
    @JsonFormat
    private String resistances;
    @ElementCollection
    private List<String> rules;


}
