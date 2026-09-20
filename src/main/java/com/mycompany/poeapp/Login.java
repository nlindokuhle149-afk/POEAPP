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
    private boolean hasSpecialCharacter;
    private boolean hasCapitalLetter;
    
    

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
        if (password == null|| password.length()<8){
            return false;
        }
        boolean hascapitalletters =false;
        boolean hasNumber = false;
        boolean hasspeciallcharacter = false;
        for (int i = 0;i < password.length();i++){
            char character = password.charAt(i);
            
            if (Character.isUpperCase(character)){
                boolean hascapitalletter = true;
            }
            if (Character.isDigit(character)){
                hasNumber= true;
            }
            if(!Character.isLetterOrDigit(character)){
                boolean hasSecialCharacter = true;
            }
        }
        return hasCapitalLetter && hasNumber &&hasSpecialCharacter;
                
  
    }

    public boolean checkcellphoneNumber() {
        Object cellphoneNumber = null;
        if (cellphoneNumber == null){
            return false;
            
        }
        return cellphoneNumber();
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

    String registeruser() {
        if (!checkusername()){
     return "username is not correctly formatted;please ensure that your username contains an under score and is no more than five characters";
      }
       
        if (!checkpasswordcomplexity()){
            return "password does not meet the complexity requirement";
        }
       
        
        
        if (!checkcellphoneNumber()){
        return "cellphone number is incorrectly formatted try again";
    }
        return "user has been registered successfully.";
    }
    
  

   public boolean loginuser(String loginusername, String loginpassword) {
      
        
        if (username == null|| password == null){
            return false;
        }
        return username.equals(loginusername)
        && password.equals(loginpassword);
    }

    public String returnLoginstatus(boolean loginsuccessful){
    if (loginsuccessful){
        return "welcome"+ firstName+","+ lastName+ "it is great to see you again.";
        }else{
        return "username or password incorrect, please try again";
    }
    } 
    /**
     *
     * @return
     */
    
        public String firstName(){
          return firstName;  
        }
        public String getlastName(){
            return lastName;
}
        public String getusername(){
       return username;
        }
        public String getpassword(){
            return username;
    }
        public String getcellphoneNumber(){
            return cellphoneNumber;
        }

    private boolean cellphoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
