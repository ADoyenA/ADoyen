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
public class WindowsPhone extends Handphone{
    
    private String wpKeyStore;

    public WindowsPhone(String main, String os, String model, int harga) {
        super(main, os, model, harga);
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

    @Override
    public void displayProduct() {
        super.displayProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Wp Key Store : " + getWpKeyStore());
    }
    
    
    
}
