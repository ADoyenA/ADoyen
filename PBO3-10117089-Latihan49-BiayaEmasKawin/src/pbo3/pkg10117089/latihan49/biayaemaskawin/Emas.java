/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan49.biayaemaskawin;

/**
 *
 * @author a
 */
public class Emas {
    private double totalBerat;
    private double harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
    public double totalHarga(double totalBerat, double harga){
        return totalBerat*harga;
    }
    
}
