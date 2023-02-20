package sk.tmconsulting.model;

import java.io.Serializable;

public class Kniha implements Serializable {
    // fields, cize premenne triedy
    private String obsah;
    private String zaner;
    private String nazov;
    private String autor;
    private int pocetStran;
    private double cena;
    private int rok;

    public String getObsah() {
        return obsah;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah;
    }

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }



}

