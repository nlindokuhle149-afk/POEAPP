/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeapp;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class StoredMessagesManager {
    private Message[] sendMessages = new Message [0];
    private Message[] disregardedMessages = new Message [0];
    private Message[] storedMessages = new Message [0];
    
    private String[] messageHashes = new String [0];
            private String[] messageIDs = new String[0];
            
            public void addMessage(Message message,String status){
                if(message == null || status == null){
                    return;
                }
                String messageStatus = status.trim().toLowerCase();
                
                switch (messageStatus){
                   case "sent":
                     sendMessages = Arrays.copyOf(
                             sendMessages, sendMessages.length + 1);
                     sendMessages [sendMessages.length - 1] = message;
                     break;
                     
                    case "stored": 
                        storedMessages = Arrays.copyOf(storedMessages,
                                storedMessages.length + 1);
                        storedMessages[storedMessages.length - 1] = message;
                        break;
                        
                    case "disregard":
                    case "disregarded":
                        disregardedMessages = Arrays.copyOf(disregardedMessages,
                                disregardedMessages.length +1);
                        disregardedMessages[disregardedMessages.length - 1] = message;
                        break;
                        
                    default:
                        System.out.println("invalid message status.");
                        return;
                        
                }
                messageHashes = Arrays.copyOf(messageHashes,
                        messageHashes.length +1);
                messageHashes[messageHashes.length - 1] = message.getMessageHash();
                
                messageIDs = Arrays.copyOf(messageIDs,
                        messageIDs.length + 1);
                messageIDs[messageIDs.length - 1]= message.getMessageID();  
                }
            public void displayStoredSendersAndRecipients(){
                
                if (storedMessages.length == 0){
                   System.out.println("no stored mesaages available");
                   return;
                }
                for (Message message : storedMessages){
                    System.out.println("sender: developer");
                    System.out.println("recipient:" + message.getRecipient());
                    System.out.println("--------------------------------");
                }
            }
            public String getLongestStoredMessage(){
               if (storedMessages.length == 0) {
                   return "no stored messages available";
               }
               Message longest = storedMessages[0];
               for (Message message:storedMessages){
                   if (message.getMessageText().length()> longest.getMessageText().length()){
                       longest = message;
                   }
               }
               return longest.getMessageText();
            }
            
            public Message searchMessageByID(String id){
                for (Message message : storedMessages){
                    if (message.getMessageID().equals(id)){
                        return message;
                    }
                }
                for (Message message : sendMessages){
                    if (message.getMessageID().equals(id)){
                        return message;
                    }
                }
                for (Message message: disregardedMessages){
                    if (message.getMessageID().equals(id)){
                        return message;
                }
            }
           return null;
            }
            public Message[] searchMessagesByRecipient(String recipient){
               Message[] results = new Message[0];
               
               for (Message message : storedMessages){
                   if (message.getRecipient().equals(recipient)){
                       results = Arrays.copyOf(results,results.length +1);
                       results [results.length - 1]= message;
                   }
               }
               for (Message message : sendMessages){
                   if (message.getRecipient().equals(recipient)){
                       results = Arrays.copyOf(results, results.length +1);
                       results[results.length - 1] = message;
                   }
                   }
               return results;
            }
public boolean deleteMessageByHash(String hash){
    for (int i = 0; i < storedMessages.length; i++){
      if (storedMessages[i].getMessageHash().equals(hash)) {
          System.out.println("message:"
          + storedMessages[i].getMessageText());
          storedMessages = removeMessage(storedMessages,i);
          System.out.println("message successfuly deleted");
          return true;
      
      } 
    }
    System.out.println("message hash not found");
    return false;
}
private Message[] removeMessage(Message[]messages,int index){
    Message[] updated = new Message[messages.length - 1];
    for (int i = 0, j = 0; i < messages.length; i++){
        if (i != index){
            updated[j++]= messages[i];
        }
    }
    return updated;
}

public void displayMessageReport(){
    if (storedMessages.length == 0){
        System.out.println("no stored messages available");
        return;
    }
    System.out.println("\n========STORED MESSAGE REPORT=========");
    
    for (Message message : storedMessages){
        
        System.out.println("Sender: Developer");
        System.out.println("Message ID:"+ message.getMessageID());
        System.out.println("Message Hash:" + message.getMessageHash());
        System.out.println("Recipient:"+ message.getRecipient());
        System.out.println("Message" + message.getMessageText());
        
        System.out.println("------------------------------------------");
        
    }
}
public Message[] getsendMessages(){
    return Arrays.copyOf(sendMessages, sendMessages.length);
}
public Message[] getstoredMessages(){
    return Arrays.copyOf(storedMessages, storedMessages.length);
}
   public Message[] getdisregardedMessages(){
       return Arrays.copyOf(disregardedMessages, disregardedMessages.length);
   }
   public String[] getMessageHashes(){
       return Arrays.copyOf(messageHashes, messageHashes.length);
   }
   public String[] getMessageIDs(){
       return Arrays.copyOf(messageIDs, messageIDs.length);
   }
}

