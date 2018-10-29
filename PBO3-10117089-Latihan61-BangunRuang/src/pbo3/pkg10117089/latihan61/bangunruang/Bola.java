/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan61.bangunruang;

/**
 *
 * @author a
 */
public class Bola implements BangunRuang{
    
    private double jari;
    
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    

    @Override
    public double hitungVolume() {
        
        return (1.33*(Math.PI*Math.pow(getJari(), 3))); 
    }
    
    
}
