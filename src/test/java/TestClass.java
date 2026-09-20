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
        Login user = new Login("kyl_1",
                "Ch&&sec@ke99!","+27838968976","Kyle","Smith");
        assertTrue(user.checkuserName());
    }
    
    public void testcheckusername_incorrectlyformated(){
          Login user = new Login("kyle!!!!!!",
                "Ch&&sec@ke99!","+27838968976","Kyle","Smith");
        assertFalse(user.checkuserName());
    }
    public void tsestcheckpasswordcomplexity_meetsrequirements(){
          Login user = new Login("kyl_1",
                "Ch&&sec@ke99!","+27838968976","Kyle","Smith");
        assertTrue(user.checkPasswordComplexity());
    }
     
    public void checkpasswordcomplexity_doesnotmeetrequirements(){
          Login user = new Login("kyl_1",
                "password","+27838968976","Kyle","Smith");
        assertFalse(user.checkPasswordComplexity());
    }
    
     public void testcellphonenumber_correctlyformated(){
        Login user = new Login("kyl_1",
                "Ch&&sec@ke99!","+27838968976","Kyle","Smith");
        assertTrue(user.checkCellPhoneNumber());
     }
     
      public void testcellphonenumber_incorrectlyformated(){
        Login user = new Login("kyl_1",
                "Ch&&sec@ke99!","08966553","Kyle","Smith");
        assertFalse(user.checkCellPhoneNumber());
     }
      
}
