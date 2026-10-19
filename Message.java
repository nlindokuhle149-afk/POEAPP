/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeapp;
import java.util.UUID;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Student
 */
public class Message {
    private String messageID;
    private String recipient;
    private String messageText;
    private String messageHash;
    private int messageNumber;
    
    public Message(int messageNumber,String recipient,
            String messageText,String messageID){
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.messageText = messageText;
        this.messageID = messageID;
        this.messageHash = createMessageHash();
                
    }
    public boolean checkMessageID(){
        return messageID != null && messageID.length()<=10;
        
    }
    public String checkRecipientcell(){
        if (recipient != null &&
                recipient.matches("^\\+27\\d{9}$")){
          return "cell phone number successfuly captured.";  
        }
        return "cell phone number is incorrectly formatted or does not contain international code.please correct the number and try again.";
    }
    
    public String createMessageHash(){
        String [] words = messageText.trim().split("\\s+");
        String first = words.length > 0 ? words [0] : "";
        String last = words.length > 0 ? words[words.length - 1] : "";
        
        String firstTwo = messageID.substring(
                0,Math.min(2, messageID.length()));
        return (firstTwo + ":" + messageNumber + ":" + first + last).toUpperCase();
    }
    public String SentMessage(String choice){
        switch (choice){
            case "1":
                return "message successfuly sent.";
            case "2":
                return "press 0 to delete the message.";
            case "3":
                return "message successfuly stored.";
            default:
                return "invalid option.";
        }
    }
    public String printMessages(){
        return "Message ID:" + messageID + "\nMessage Hash:" + messageHash +
                "\nRecipient:" + recipient + "\nMessage:" + messageText;
                 }
    public int returnTotalMessages(){
        return messageNumber;
    }
    public String getMessageID(){
        return messageID;
    }
    public String getMessageHash(){
        return messageHash;
    }
    public String getRecipient(){
        return recipient;
    }
    public String getMessageText(){
        return messageText;
    }
    public void storeMessage(){
        try (FileWriter writer = new FileWriter("message.json", true)){
  writer.write ("{\n");
            writer.write (" \"messageID\": \"" + messageID + "\",\n");
            writer.write (" \"messageHash\":\"" + messageHash + "\",\n");
            writer.write ("\"recipient\": \"" + recipient + "\",\n");
            writer.write ("\"message\": \"" + messageText + "\",\n");
            writer.write ("}\n");
        } catch (IOException e){
            System.out.println("error storing meesage:"+ e.getMessage());
        }
    }
}
