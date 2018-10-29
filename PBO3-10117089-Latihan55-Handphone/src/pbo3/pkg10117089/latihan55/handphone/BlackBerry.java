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
public class BlackBerry extends Handphone{
    
    private String pinBB;

    public BlackBerry(String main, String os, String model, int harga) {
        super(main, os, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

    @Override
    public void displayProduct() {
        super.displayProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("PIN : " + getPinBB() + "\n");
    }
    
    
    
}
