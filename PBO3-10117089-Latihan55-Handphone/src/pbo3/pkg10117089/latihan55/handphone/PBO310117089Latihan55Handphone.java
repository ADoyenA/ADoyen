/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan55.handphone;

/**
 *
 * @author a
 */
public class PBO310117089Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android droid1 = new Android("Samsung", "Android", "Grand", 3000000);
        droid1.setKeyStore("234ibfd3840fo");
        droid1.displayProduct();
        
        BlackBerry BB1 = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        BB1.setPinBB("BHS249");
        BB1.displayProduct();
        
        WindowsPhone wp1 = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp1.setWpKeyStore("UUUQIJWORJ");
        wp1.displayProduct();
    }
    
}
