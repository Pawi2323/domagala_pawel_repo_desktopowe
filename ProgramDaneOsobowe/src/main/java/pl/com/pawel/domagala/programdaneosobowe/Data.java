/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.pawel.domagala.programdaneosobowe;

/**
 *
 * @author domag
 */
public class Data {
    String imie;
    String nazwisko;
    String klasa;
    String rok;

    public Data(String imie, String nazwisko, String klasa, String rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rok = rok;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }
}
