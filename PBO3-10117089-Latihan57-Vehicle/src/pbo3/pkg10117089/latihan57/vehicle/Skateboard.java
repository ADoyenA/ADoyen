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
public class Skateboard extends Vehicle{
    
    private double myBoardLength;

    public Skateboard() {
        System.out.println("SkateBoard");
        super.setMyBrand("Ally Skate");
        super.setMyModel("Rocket");
        System.out.println("Brand : " + super.getMyBrand());
        System.out.println("Model : " + super.getMyModel());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
    
    
}
