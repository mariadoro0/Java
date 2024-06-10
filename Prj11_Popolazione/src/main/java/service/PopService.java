package service;

import entities.Provincia;

import java.util.List;

public interface PopService {

    List<String> getRegioni();
    List<Provincia> getProvinceByRegione(String regione);
    Provincia getProvinciaById(int id);



}
