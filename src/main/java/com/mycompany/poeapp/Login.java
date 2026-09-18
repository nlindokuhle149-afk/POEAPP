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
    private String userName;
    private String password;
    private String cellPhoneNumber;
   
    //consructor 
    public Login(){
    }
    
    //constuctor used to store registration details 
    public Login(String firstName,String lastName,String userName,String password,
            String cellPhoneNumber){
        
    this.firstName = firstName;
    this.lastName = lastName;
     this.userName = userName;
     this.password = password;
    this.cellPhoneNumber = cellPhoneNumber;        
    }
    //----------------------------------------------------------------------
    // checkuserName()
    //-----------------------------------------------------------------------
    public boolean checkuserName(){
        /*
        * user must   
        *
        */
        
        return userName != null
                && userName.contains("_")
                && userName.length()<=5;
    }
    //----------------------------------------------------------------------
    //check password
    //-----------------------------------------------------------------------
    public boolean checkPasswordComplexity(){
        /* PASSSWORD must:
        * 1.be at least 8 characters long
        * 2.contain a capital letter
        * 3.contain a number
        * 4. contain a special character
        */
        if (password == null || password.length()<8){
            
        }
        boolean hascapitalLetter = false;
         boolean hasNumber = false;
        boolean   hasspecialcharacter = false;
        
        for(int i = 0;i <password.length();i++){
            char Character = password.charAt(i);
            
       if (Character.isUpperCase(character)){
           hascapitalLetter= true;
       }if (Character.isDigit(character)){
           hasNumber = true;
       }if (!Character.isLetterorDigit(character)){
           hasspecialcharacter = true;
       }
        }
    
       
                
            
                    
