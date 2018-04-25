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
public class Czekolada extends Product{
    
    private String smak;
    
         public Czekolada(double price, String name, String describe,String smak){
        super(price, name, describe);
        this.smak=smak;
    }
    
    
     public void buy() {
        System.out.println(
                "KupiĹ‚em czekoladÄ™");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
                + "smak:"+smak
        );
    }
    
}
