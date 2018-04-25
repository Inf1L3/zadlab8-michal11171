/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author student
 */
public class Produkty {
    String p[]= new String[10];
 
        p[0] = new Ksiazka(50, "ksiazka", "opis");
        p[1] = new Czekolada(3, "czekolada", "opis2");
        p[2] = new Ksiazka(35, "ksiazka2", "opis3");
        p[3] = new Dlugopis(2, "dlugopis", "opis4");
        p[4] = new Dzem(8, "dzem", "opis5");
        p[5] = new Polopiryna(20, "polopiryna", "opis6");
        p[6] = new Dzem(6, "dzem2", "opis7");
        p[7] = new Czekolada(4, "czekolada2", "opis8");
        p[8] = new Dlugopis(1, "dlugopis2", "opis9");
        p[9] = new Tractor(20000, "traktor", "opis10");  
         for(int i=0; i < p.length; i++){
            System.out.println();
            p[i].buy();
            p[i].showInfo();
        }
        System.out.println();
    
}
