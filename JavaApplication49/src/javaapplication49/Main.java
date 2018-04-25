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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1
        Tractor tr = new Tractor(0, "UU", "VV");
        
        tr.buy();
        tr.showInfo();
                
        //3
        
       Product[] produkt = new Product[10];
        
        produkt[0] = new Ksiazka(50, "ksiazka", "opis");
        produkt[1] = new Czekolada(3, "czekolada", "opis2","smak");
        produkt[2] = new Dzem(6, "dzem", "opis3");
        produkt[3] = new Dlugopis(2, "dlugopis", "opis4");
        produkt[4] = new Dzem(8, "dzem2", "opis4");
        produkt[5] = new Polopiryna(20, "polopiryna", "opis6");
        produkt[6] = new Czekolada(4, "czekolada2", "opis6","smak2");
        produkt[7] = new Dlugopis(1, "dlugopis2", "opis9");
        produkt[8] = new Ksiazka(35, "ksiazka2", "opis8");
        produkt[9] = new Tractor(20000, "traktor", "opis9");  
        
        
        for(int i=0; i<10; i++){
            System.out.println("\nProdukt "+(i+1));
            produkt[i].buy();
            produkt[i].showInfo();
                 
        }
        
        
    }
    
}
