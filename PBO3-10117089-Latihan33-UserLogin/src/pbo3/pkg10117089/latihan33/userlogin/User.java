/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan33.userlogin;

/**
 *
 * @author a
 */
public class User {
    
    private String username ;
    private String password ;
    private boolean statusAkun;
    
    
    private boolean cekAkun(String parUsername, String parPassword){
     username = "ADoyen";
     password = "cakepselalu";
     
     statusAkun = (parPassword.equals(password) && (parUsername.equals(username)));
     return statusAkun;
    }
    
    private  void hasilLogin(boolean status, String parUsername){
        if(status==true){
            System.out.println("\n"+"******Hallo " 
                    + parUsername.toUpperCase()+ "******");
            System.out.println("Selamat Datang di applikasi ini");
        }else {
            System.out.println("\n" + "Ooops, Username "
                    + "atau Password anda salah");
        }
    }

                
          
   public void pengecekkanLogin (String parUsername, String parPassword){
    
       cekAkun(parUsername, parPassword);
       hasilLogin(statusAkun, parUsername);
       
    }
   }