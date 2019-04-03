package sample;

import java.util.ArrayList;

public class Artikl {
    private String sifra;
    private String naziv;
    private Double cijena;

    public Artikl() {

    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Artikl {" + sifra + ',' + naziv + ',' + cijena + '}';
    }

    public Artikl(String podatak) {
        String[] artikl = podatak.split(",");
        sifra = artikl[0];
        naziv = artikl[1];
        cijena = Double.parseDouble(artikl[2]);
    }

    @Override
    public boolean equals(Object o) {
        Artikl artikl = (Artikl) o;
        Artikl a = (Artikl) o;
        if (this == o) return true;
        if (naziv.equals(a.getNaziv())) return false;
        return super.equals(o);
    }

    public static ArrayList<Artikl>
    izbaciDuplikate(ArrayList<Artikl> artikli){
        for (int i=0; i<artikli.size(); i++){
            for (int j=i+1; j<artikli.size(); j++){
                if (artikli.get(i).equals(artikli.get(j))) artikli.remove(j);
            }
        }
        return artikli;
    }
}