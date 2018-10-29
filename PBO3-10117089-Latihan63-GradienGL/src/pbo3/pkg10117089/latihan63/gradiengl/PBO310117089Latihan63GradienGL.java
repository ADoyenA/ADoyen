/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan63.gradiengl;

/**
 *
 * @author a
 */
public class PBO310117089Latihan63GradienGL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Koordinat GGL1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + GGL1.getX1()+"," 
                + GGL1.getY1() + ") dan (" + GGL1.getX2() + "," 
                + GGL1.getY2() + ")\nmemiliki gradien sebesar " 
                + GGL1.hitungGradien());
        
        Koordinat GGL2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + GGL2.getX1()+"," 
                + GGL2.getY1() + ") dan (" + GGL2.getX2() + "," 
                + GGL2.getY2() + ")\nmemiliki gradien sebesar " 
                + GGL2.hitungGradien());
    }
    
}
