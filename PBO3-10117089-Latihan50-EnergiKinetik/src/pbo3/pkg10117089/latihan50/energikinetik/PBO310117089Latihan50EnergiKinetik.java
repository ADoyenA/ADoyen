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
public class PBO310117089Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BolaBaseball baseball = new BolaBaseball();
        
        baseball.setMassa(145);
        baseball.setKecepatan(25);
        
        System.out.println("Massa bola awal : "+baseball.getMassa()+" gram");
        System.out.println("Kecepatan bola dilempar : "
                +baseball.getKecepatan()+"m/s");
        
        System.out.println("\n"+"========Hasil Perhitungan========"+"\n");
        
        System.out.println("Massa bola dalam Kg : "
                +baseball.rumusGramKeKg(baseball.getMassa())+" kg");
        System.out.println("Energi Kinetik : " + baseball.rumusEnergiKinetik
        (baseball.rumusGramKeKg(baseball.getMassa()), 
                baseball.getKecepatan())+ " Joule");
        
        System.out.println("Usaha bola dari keadaan diam : "+baseball.rumusUsaha
        (baseball.rumusEnergiKinetik(baseball.rumusGramKeKg
        (baseball.getMassa()), baseball.getKecepatan())) + " joule");
    }
    
}
