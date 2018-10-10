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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Osoba[] tab = new Osoba[6];

        tab[0] = new Piekarz("Maciek", "Kot", 25);
        tab[1] = new Mechanik("Kamil", "Lampart", 21);
        tab[2] = new Piekarz("Lukasz", "Nowojorski", 24);
        tab[3] = new Nauczyciel("Kamil", "Kustak", 24);
        tab[4] = new Mechanik("Krzysztof", "Barutowicz", 31);
        tab[5] = new Murarz("Michal", "Korpinicki", 30);

        for (int i = 1; i <= 6; i++) {
            System.out.println(tab[i].PokazDane());
        }

    }
}