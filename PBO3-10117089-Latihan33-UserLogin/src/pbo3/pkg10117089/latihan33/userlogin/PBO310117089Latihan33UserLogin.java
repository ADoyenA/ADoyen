/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan33.userlogin;

import java.util.Scanner;
import sun.security.util.Password;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk login 
 * 
 */
public class PBO310117089Latihan33UserLogin {

        
    private static String usName;
    private static String passWord;


    public static void main(String[] args) {
        // TODO code application logic here
    
        
        
        Scanner keyboard = new Scanner(System.in);
        User user1 = new User();
        
        System.out.print("Masukkan Username : ");
        usName = keyboard.next();
        
        System.out.print("Masukkan Password : ");
        passWord = keyboard.next();
        
        user1.pengecekkanLogin(usName, passWord);
    }
    
    
}
