/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeapp;

/**
 *
 * @author Student
 */
public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellphoneNumber;
    
    

    public Login(String firstName, String lastName, String username, String password, String cellphoneNumber) {
   this.firstName = firstName;
   this.lastName = lastName;
   this.username = username;
   this.password = password;
   this.cellphoneNumber = cellphoneNumber;
     
    }
    
   public boolean checkusername() {
       return username != null
               && username.contains("_")
               && username.length()<=5;
        
    }

    boolean checkpasswordcomplexity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkcellphoneNumber() {
        Object cellphoneNumber = null;
        if (cellphoneNumber == null){
            return false;
            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkuserName() {
        return username != null
               && username.contains("_")
               && username.length()<=5;
        
        
    }

    public boolean checkPasswordComplexity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkCellPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkpassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkpasswordcomlexity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
