/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan48.kalkulator;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil kalkulator
 */
public class PBO310117089Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator caltor = new Kalkulator();
        
        caltor.setValue1(7);
        caltor.setValue2(5);
        
        System.out.println("Value 1 : " + caltor.getValue1());
        System.out.println("Value 2 : " + caltor.getValue2());
        caltor.setNameProject();
        caltor.setNoteProject("This Project shown you how to manage method in java");
        System.out.println("Result Add is = " 
                + caltor.add(caltor.getValue1(), caltor.getValue2()));
        System.out.println("Result Minus is = " 
                + caltor.minus(caltor.getValue1(), caltor.getValue2()));
        System.out.println("Result Multiple is = " 
                + caltor.multiple(caltor.getValue1(), caltor.getValue2()));
        System.out.println("Result Division is = " 
                + caltor.division(caltor.getValue1(), caltor.getValue2()));
    }
       
}
