/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */
public abstract class Osoba {

    private final String imie;
    private final String nazwisko;
    private final int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

        public void PokazDane()
        {
                    
        }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + '}';
    }
    

    abstract public void Mow();

}
