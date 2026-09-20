/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class POEAPP {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("=============================");
       System.out.println("CHAT APPLICATION");
       System.out.println("==============================");
       //----------------------------------------------------
       // REGISTRATION
       //------------------------------------------------------------
       System.out.print("\n---REGISTRATION---");
       
       System.out.print("Enter your first name:");
       String firstName = input.nextLine();
       
        System.out.print("Enter your last name:");
        String lastName = input.nextLine();
        
        System.out.print("Enter your username");
        String username = input.nextLine();
        
        System.out.print("Enter password:");
        String password = input.nextLine();
        
        System.out.print("Enter your south afican cellphone number:");
        String cellphoneNumber = input.nextLine();
        
        //create login object containing the users details
        Login user = new Login(
                firstName,
                lastName,
                username,
                password,
                cellphoneNumber);
        
        //check user name 
        if(user.checkusername()){
          System.out.println("username successfully captured");
        }else{
            System.out.println("username is not correctly formatted;"
            + "please ensure that your username contains"
            +"an underscore and is no more than five"
            +"characters in length"
            );
        }
        //check password
        if (user.checkpasswordcomplexity()){
           System.out.println("password successfully captured.");
        }else{
            System.out.println("password is not correctly formatted;"
            +"please ensure that the password contains"
            +"at least eight characters, a capital letter,"
            +"a number, and a special character."
            );
        }
    }
    
}
