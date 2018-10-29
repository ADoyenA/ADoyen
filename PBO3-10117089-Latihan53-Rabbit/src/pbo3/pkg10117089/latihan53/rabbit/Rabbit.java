/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan53.rabbit;

/**
 *
 * @author a
 */
public class Rabbit extends Animal{
    private String color;
    private String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
        System.out.println("Hello, His name is " + name);
        System.out.println(name +" is Vegetarian? " + veg);
        System.out.println(name + " eats " + food);
        System.out.println(name + " has " + legs + " legs");
        System.out.println(name+" color is " + color + "\n");
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    


    

    
    
}
