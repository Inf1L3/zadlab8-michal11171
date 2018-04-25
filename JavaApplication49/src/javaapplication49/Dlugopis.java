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
public class Dlugopis extends Product {
    
        public Dlugopis(double price, String name, String describe){
        super(price, name, describe);
    }
    
    
     public void buy() {
        System.out.println(
                "KupiĹ‚em dĹ‚ugopis");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    
}
