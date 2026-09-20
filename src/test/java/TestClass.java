/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.poeapp.Login;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Student
 */
public class TestClass {
    public void testcheckusername_correctlyformated(){
        Login user = new Login("kyle",
                "smith","kyl_1","Ch&&sec@ke99!","+27838968976");
        assertTrue(user.checkuserName());
    }
    
    public void testcheckusername_incorrectlyformated(){
          Login user = new Login("kyle",
                "smith","kyle!!!!!","Ch&&sec@ke99!","+27838968976");
        assertFalse(user.checkuserName());
    }
    public void tsestcheckpasswordcomplexity_meetsrequirements(){
          Login user = new Login("kyle",
                "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
        assertTrue(user.checkPasswordComplexity());
    }
     
    public void checkpasswordcomplexity_doesnotmeetrequirements(){
          Login user = new Login("kyle",
                "Smith","kyl_1","password","+27838968976");
        assertFalse(user.checkPasswordComplexity());
    }
    
     public void testcellphonenumber_correctlyformated(){
        Login user = new Login("kyle",
                "Smith","kul_1","Ch&&sec@ke99!","+27838968976");
        assertTrue(user.checkCellPhoneNumber());
     }
     
      public void testcellphonenumber_incorrectlyformated(){
        Login user = new Login("kyle",
                "Smith","kyl_1","Ch&&sec@ke99!","08966553");
        assertFalse(user.checkCellPhoneNumber());
     }
      public void testregisteruser_usernamefails(){
          Login 
        user = new Login("kyle",
                "Smith","kyle!!!!!!","Ch&&sec@ke99!","Smith");
          assertEquals("username is not correctly formated; ensure username"
                  +"contains an underscore and is no more than five characters in length",
                  user.registerUser());
          
      }
      public void testregisteruser_passwordfails(){
         Login user = new Login("kyle",
                "Smith","kyl_1","password","+27838968976");
          assertEquals("password is not correctly formated; ensure that the password"
                  +"contains at least eight characters,a capital letter,a number,and a special character",
                   
                  user.RegisterUser());
          
      }
      public void testregisteruser_cellphonenumber(){
         Login user = new Login("kyle",
                "smith","kyl_1","Ch&&sec@ke99!","+27838968976");
    assertEquals("cellphone number is incorrectly formated or dose not contain international code"
          +"please correct the number and try again",
            user.registerUser());
      }
      
      public void testregisteruser_success(){
          Login user = new Login("kyle",
                "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
        assertEquals("user has been registered successfuly",
                user.RegisterUser());
      }
      public void testloginuser_successful(){
           Login user = new Login("kyle",
                "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
           assertTrue(user.loginuser("kyl_1","Ch&&sec@ke99!"));
      }
      public void testloginuser_failed(){
           Login user = new Login("kyle",
           "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
           assertFalse(user.loginuser("kyl_1", "wrong password"));
      }
      public void testreturnloginstatus_(){
          Login user = new Login("kyle",
           "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
          assertEquals("welcome kyle,Smith,it is great to see you again.",
                  user.returnLoginstatus(true));
      }
      public void testreturnloginstatus_failure(){
          Login user = new Login("kyle",
           "Smith","kyl_1","Ch&&sec@ke99!","+27838968976");
          assertEquals("user or password incorrect,please try again.",
                  user.returnLoginstatus(false));
      }
      
}
