/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Milan
 */
public class Knjiga {
     private int idKnjige=-1;
    private String nazivKnjige;
    private int kolicina;
    private String kategorija;
    private Date  datumIzdavanja;

    public Knjiga(String nazivKnjige, int kolicina, String kategorija, Date datumIzdavanja) {
        this.nazivKnjige = nazivKnjige;
        this.kolicina = kolicina;
        this.kategorija = kategorija;
        this.datumIzdavanja = datumIzdavanja;
    }
    
    public Knjiga(int idK,String nazivKnjige, int kolicina, String kategorija, Date datumIzdavanja) {
        this(nazivKnjige,kolicina,kategorija,datumIzdavanja);
        this.idKnjige=idK;        
    }

    public int getIdKnjige() {
        return idKnjige;
    }

    public void setIdKnjige(int idKnjige) {
        this.idKnjige = idKnjige;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "idKnjige=" + idKnjige + ", nazivKnjige=" + nazivKnjige + ", kolicina=" + kolicina + ", kategorija=" + kategorija + ", datumIzdavanja=" + datumIzdavanja + '}';
    }
    
    
    
}

