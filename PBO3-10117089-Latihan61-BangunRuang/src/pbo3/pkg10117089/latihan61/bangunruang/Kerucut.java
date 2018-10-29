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
public class Kerucut implements BangunRuang{
    
    private double jari;
    private double tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
      return (0.33*Math.PI*Math.pow(getJari(), 2)*getTinggi());  
    }
    
    
    
}
