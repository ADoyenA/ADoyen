/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * kalimat
 */
public class PBO310117089Latihan30Cakep {

  //    kode text color
    public static final String DOYEN_RESET = "\u001B[0m";
    public static final String DOYEN_BLACK = "\u001B[30m";
    public static final String DOYEN_RED = "\u001B[31m";
    public static final String DOYEN_GREEN = "\u001B[32m";
    public static final String DOYEN_YELLOW = "\u001B[33m";
    public static final String DOYEN_BLUE = "\u001B[34m";
    public static final String DOYEN_PURPLE = "\u001B[35m";
    public static final String DOYEN_CYAN = "\u001B[36m";
    public static final String DOYEN_WHITE = "\u001B[37m";
//    kode background color
    public static final String DOYEN_BLACK_BACKGROUND = "\u001B[40m";
    public static final String DOYEN_RED_BACKGROUND = "\u001B[41m";
    public static final String DOYEN_GREEN_BACKGROUND = "\u001B[42m";
    public static final String DOYEN_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String DOYEN_BLUE_BACKGROUND = "\u001B[44m";
    public static final String DOYEN_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String DOYEN_CYAN_BACKGROUND = "\u001B[46m";
    public static final String DOYEN_WHITE_BACKGROUND = "\u001B[47m";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String jawab;

        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print
        (DOYEN_RED + "Kamu " + DOYEN_RESET);
        System.out.print(DOYEN_GREEN + "ngerjain sendiri " + DOYEN_RESET);
        System.out.print(DOYEN_YELLOW + "latihan 17 sampe " + DOYEN_RESET);
        System.out.println(DOYEN_PURPLE + "latihan 30 ini ? " + DOYEN_RESET);
        System.out.print(DOYEN_PURPLE + "Jawab");
        System.out.print(DOYEN_RED + "(Yoi/Enggak) : " + DOYEN_RESET);
        jawab = keyboard.next();
        
        if (jawab.equals("yoi") || jawab.equals("YOI")|| jawab.equals("Yoi")){
            System.out.print("\n"+DOYEN_RED + "Cakep Bener." + DOYEN_RESET);
            System.out.println(DOYEN_CYAN + "Good Joob" + DOYEN_RESET);
        }else if (jawab.equals("enggak") || 
                jawab.equals("ENGGAK")|| jawab.equals("Enggak")) {
            System.out.println("\n"+DOYEN_RED + "Tetep cakep sih." + DOYEN_RESET);
            System.out.println(DOYEN_CYAN + "Sing penting paham konsep nya wae" + DOYEN_RESET);
            System.out.println(DOYEN_BLACK + "Keep the code works dude" + DOYEN_RESET);
        }
        
    }
    
}
