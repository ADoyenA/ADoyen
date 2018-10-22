/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan50.energikinetik;

/**
 *
 * @author a
 */
public class BolaBaseball {
    private double massa;
    private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double rumusGramKeKg (double massa){
        return massa/1000;
    } 
    
    public double rumusEnergiKinetik(double massa, double kecepatan){
        return 0.5*(massa*(Math.pow(kecepatan,2)));
    }
    
    public double rumusUsaha (double EK){
        return EK - 0;
    }
}
