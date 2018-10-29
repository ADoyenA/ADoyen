/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan57.vehicle;

/**
 *
 * @author a
 */
public class Bicycle extends Vehicle{
    
    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
        super.setMyBrand("Trek Bike");
        super.setMyModel("7.4FX");
        System.out.println("Brand : " + super.getMyBrand());
        System.out.println("Model : " + super.getMyModel());
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    
    
}
