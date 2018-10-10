/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Michal;

/**
 *
 * @author Michal
 */
public class Nauczyciel extends Pracownik {

    public Nauczyciel(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Nauczyciel");
    }

    @Override
    public void WykonajPrace() {
        System.out.println("Ucze uczniow");
    }

    @Override
    public void Mow() {
        System.out.println("Poprawilem wasze zadania. Michal najlepiej zrobil programy wiec dostaje 5!");
    }

    public String PokazDane() {
        WykonajPrace();
        Mow();
        return super.PokazDane();

    }

}
