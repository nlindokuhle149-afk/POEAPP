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
public class MessageArrays {
    
    private Message[] sendMessages = new Message [0];
    private Message[] disregardedMessages = new Message [0];
    private Message[] storedMessages = new Message [0];
    
    private String[] messageHashes = new String [0];
            private String[] messageIDs = new String[0];
            
            public void addMessage(Message message,String status){
                if(message == null || status == null){
                    return;
                }
                switch (status.trim().toLowerCase()){
                    
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
            public Message[] getsendMessages(){
                return Arrays.copyOf(sendMessages, sendMessages.length);
            }
            public Message[] getDisregardedMessages(){
            return Arrays.copyOf(disregardedMessages, disregardedMessages.length);
            }
            public Message[] getStoredMessages(){
            return Arrays.copyOf(storedMessages, storedMessages.length);
            }
            public String[] getMessageHashes(){
              return Arrays.copyOf(messageHashes, messageHashes.length);
            }
            public String[] getMessageIDs(){
               return Arrays.copyOf(messageIDs, messageIDs.length);
            }
}
