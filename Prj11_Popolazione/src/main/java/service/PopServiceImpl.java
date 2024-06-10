package service;

import entities.Provincia;

import java.util.Arrays;
import java.util.List;

public class PopServiceImpl implements PopService{
    @Override
    public List<String> getRegioni() {
        String[] regioni = {"Piemonte","Sardegna","Lombardia"};
        return Arrays.asList(regioni);
    }

    @Override
    public List<Provincia> getProvinceByRegione(String regione) {
        Provincia p1 = new Provincia();
        p1.setComune("Torino");
        Provincia p2 = new Provincia();
        p2.setComune("Asti");
        Provincia p3 = new Provincia();
        p3.setComune("Cuneo");
        return List.of(p1,p2,p3);
    }

    @Override
    public Provincia getProvinciaById(int id) {
        return null;
    }
}
