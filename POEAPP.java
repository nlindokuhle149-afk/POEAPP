/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeapp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 *
 * @author Student
 */
public class POEAPP {

    private static int numberOfMessages;

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      List<Message> message = new ArrayList<>();
      
      System.out.println("Welcome to qickchat.");
      System.out.print("how many messages would you like to enter");
      input.nextLine();
      
      int totalSent = 0;
      boolean running = true;
      
      while (running) {
       System.out.println("1\n send messages");
       System.out.println("2 show recently sent message");
       System.out.println("3 quit");
       System.out.print("choose an option");
       
       String option = input.nextLine();
       switch (option){
           case "1":
               for(int i = 0; i < numberOfMessages; i++){
                   System.out.println("\nMessage" + (i + 1));
                   
                System.out.print("enter recipient (+27...):");
                String recipient = input.nextLine();
                
                if (!recipient.matches("^\\+27\\d{9}$")){
                    System.out.println("cell phone number is incorrectly formatted.please correct the number and try again");
                    i--;
                    continue;
                }
                System.out.print("enter message(maximum 250 characters):");
                String text = input.nextLine();
                
                if (text.length()>250){
                    System.out.println("please enter a message of less than 250 characters.");
                    i--;
                    continue;
                }
                String id = UUID.randomUUID()
                        .toString().replace("-", "")
                        .substring(0,10);
                
                Message newMessage=new Message(
                       i + 1,recipient,text,id
                );
                
                System.out.println("message ID:"+ newMessage.getMessageID());
                System.out.println("Message Hash:"+ newMessage.getMessageHash());
                
                System.out.println("1) send messsage\n2) discard message\n3 store message");
                System.out.print("choose an option");
                String choice = input.nextLine();
                
                if (choice.equals("1")){
                    System.out.println("message successfully sent");
                    message.add(newMessage);
                    totalSent++;
                }else if (choice.equals("2")){
                    System.out.println("press 0 to delete the message.");
                }else if (choice.equals("3")){
                    newMessage.storeMessage();
                    System.out.println("message successfully stored");
                    message.add(newMessage);
                }else{
                    System.out.println("invalid option.");
                }
                  System.out.println(message);
                
               }
               break;
           case "2":
               System.out.println("coming soon");
               break;
               case"3":
                   System.out.println("total messages sent:"+ totalSent);
                   running = false;
                   break;
                  
               default:
                   System.out.println("please select option 1,2,or 3.");
}
    }
        input.close();
    }
    
}
