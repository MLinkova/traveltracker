package sk.upjs.ics.traveltracker;

import java.util.Date;

public class Vylet {
    
    private String krajina;
    private String mesto;
    private String destinacia;
    private boolean navstivenost;
    private int hodnotenie;
    private String poznamka;
    private String podrobnosti;
    private Date datum;

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    public String getPodrobnosti() {
        return podrobnosti;
    }

    public void setPodrobnosti(String podrobnosti) {
        this.podrobnosti = podrobnosti;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getKrajina() {
        return krajina;
    }

    public void setKrajina(String krajina) {
        this.krajina = krajina;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getDestinacia() {
        return destinacia;
    }

    public void setDestinacia(String destinacia) {
        this.destinacia = destinacia;
    }

    public boolean isNavstivenost() {
        return navstivenost;
    }

    public void setNavstivenost(boolean navstivenost) {
        this.navstivenost = navstivenost;
    }
    
    
}
