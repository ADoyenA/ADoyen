/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan62.livingthing;

/**
 *
 * @author a
 */
public class PBO310117089Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Human org = new Human();
        org.setNama("Shendi Permana");
        org.walk(org.getNama());
        org.breath(org.getNama());
        org.eat(org.getNama());
    }
    
}
