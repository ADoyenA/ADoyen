/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan58.tambahkurang;

/**
 *
 * @author a
 */
public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " 
                + super.getX() + " - " + super.getY() + " = " 
                + (super.getX()-super.getY()));
    }
    
}
