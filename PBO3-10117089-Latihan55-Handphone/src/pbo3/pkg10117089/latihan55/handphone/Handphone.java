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
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String main, String os, String model, int harga) {
        this.manufacture = main;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
    
}
