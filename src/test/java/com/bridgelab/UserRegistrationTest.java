package com.bridgelab;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for first name.
    @Test
    public void firstName_returnTrue_ifProper(){
        result = userRegistration.validateName("Pooja");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_returnFalse_ifNotProper(){
        result = userRegistration.validateName("Po");
        Assert.assertFalse(result);
    }

    @Test
    public void firstName_returnFalse_whenNotProper(){
        result = userRegistration.validateName("pooja");
        Assert.assertFalse(result);
    }

    //Test cases for last name.
    @Test
    public void lastName_returnsTrue_ifProper(){
        result = userRegistration.validateName("Gaikwad");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_returnsFalse_ifNotProper(){
        result = userRegistration.validateName("Ga");
        Assert.assertFalse(result);
    }

    @Test
    public void lastName_returnFalse_ifNotProper(){
        result = userRegistration.validateName("gaikwad");
        Assert.assertFalse(result);
    }

    //Test cases for mobile number.
    @Test
    public void mobileNumber_returnTrue_ifNumberProper(){
        result = userRegistration.validateMobileNumber("91 7008409012");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifNumberNotProper(){
        result = userRegistration.validateMobileNumber("91 700840901");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifNotProper(){
        result = userRegistration.validateMobileNumber("917008409012");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumber_returnFalse_isNumberNotProper(){
        result = userRegistration.validateMobileNumber("91 0308409012");
        Assert.assertFalse(result);
    }

    //Test cases for password rule1 - minimum 8 characters.
    @Test
    public void password_returnTrue_ifItProper(){
        result = userRegistration.validatePassword("abcdEF12");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifNotProper(){
        result = userRegistration.validatePassword("abcdeF1");
        Assert.assertFalse(result);
    }

    //Test cases for password rule2 - atleast one Uppercase.
    @Test
    public void password_returnTrue_whenProper(){
        result = userRegistration.validatePassword("Abced1234");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_whenNotProper(){
        result = userRegistration.validatePassword("abcedefgh");
        Assert.assertFalse(result);
    }

    //Test cases for password rule 3 - atleast one numeric number.
    @Test
    public void password_shouldReturnTrue_whenProper(){
        result = userRegistration.validatePassword("Abce1defg1");
        Assert.assertTrue(result);
    }

    @Test
    public void password_shouldReturnFalse_whenNotProper(){
        result = userRegistration.validatePassword("Abcedefghi");
        Assert.assertFalse(result);
    }

    //Test cases for password rule 4 - exactly one special character.
    @Test
    public void password_returnTrue_ifProper(){
        result = userRegistration.validatePassword("Abce1defg1@");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifItNotProper(){
        result = userRegistration.validatePassword("Abcedefghi");
        Assert.assertFalse(result);
    }
}