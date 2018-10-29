/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan61.bangunruang;

import java.text.DecimalFormat;

/**
 *
 * @author a
 */
public class PBO310117089Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat mat = new DecimalFormat("#0.0");
        DecimalFormat mat1 = new DecimalFormat("#0");
        
        Bola bola = new Bola();
        bola.setJari(7);
        System.out.println("Volume Bola = " + mat.format(bola.hitungVolume()) 
                + " cm³");
        
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.println("\nVolume Tabung = " + mat1.format
        (tabung.hitungVolume())+" cm³");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("\nVolume Kerucut = " + mat1.format
        (kerucut.hitungVolume()) + " cm³");
    }
    
}
