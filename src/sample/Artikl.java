package sample;

import java.util.ArrayList;

public class Artikl {
    private String sifra;
    private String naziv;
    private Double cijena;

    public Artikl (){

    }
    public String getSifra(){
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }
    public String getNaziv (){
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena(){
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

}
