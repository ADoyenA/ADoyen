/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan60.akatsuki;

/**
 *
 * @author a
 */
public class PBO310117089Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Akatsuki knh1,sn1;
        
        knh1 = new Konoha();
        knh1.setNama("Itachi");
        knh1.setKekuatan("Mata Saringgan");
        System.out.println("Namaku " + knh1.getNama() 
                + " aku memiliki kekuatan " + knh1.getKekuatan());
        knh1.asalDesa();
        
        sn1 = new Suna();
        sn1.setNama("Sasori");
        sn1.setKekuatan("Mengendalikan Boneka");
        System.out.println("Namaku " + sn1.getNama() 
                + " aku memiliki kekuatan " + sn1.getKekuatan());
        sn1.asalDesa();
    }
    
}
