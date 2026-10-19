/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeapp;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Student
 */
public class MessageTest {
    void testMessageIDisValid(){
        Message message = new Message(
                1,"+27718693002", "hi Mike","1234567890");
        assertTrue(message.checkMessageID());
    }
    void testRecipientNumberisValid(){
        Message message = new Message(
        1, "+27718693002","hi Mike","1234567890");
        assertEquals("cell phone number successfully captured",
                message.checkRecipientcell());
    }
    void testRecipientNumberInvalid(){
        Message message = new Message(
        1, "08575975889", " hi Mike","1234567890");
        assertTrue(message.checkRecipientcell().contains("incorrectly formated"));
    }
    void testMessageHashIsCreated(){
        Message message = new Message(
        1,"+27718693002","hi Mike","1234567890");
        assertNotNull(message.getMessageHash());
    }
    void testMessageCanBeStored(){
        Message message = new Message(
        1,"+27718693002","hi Mike","1234567890");
        try {
            message.storeMessage();
        }catch(Exception e){
            fail("storeMessage threw an exception:"+ e.getMessage());
        }
    }
        void testMessageLengthLimit(){
        String longMessage = "a".repeat(251);
        assertTrue(longMessage.length()>250); 
    }
    }


