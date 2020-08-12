package com.bridgelab;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for first name.
    @Test
    public void firstName_returnsTrue_ifFirstNameProper(){
        result = userRegistration.firstName("Pooja");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_returnsFalse_ifNumberOfCharDoesNotMatch(){
        result = userRegistration.firstName("Po");
        Assert.assertFalse(result);
    }

    @Test
    public void firstName_returnFalse_ifFirstCharNotUppercase(){
        result = userRegistration.firstName("pooja");
        Assert.assertFalse(result);
    }

    //Test cases for last name.
    @Test
    public void lastName_returnsTrue_ifLastNameProper(){
        result = userRegistration.lastName("Gaikwad");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_returnsFalse_ifNumberOfCharDoesNotMatch(){
        result = userRegistration.lastName("Ga");
        Assert.assertFalse(result);
    }

    @Test
    public void lastName_returnFalse_ifFirstCharNotUppercase(){
        result = userRegistration.lastName("gaikwad");
        Assert.assertFalse(result);
    }

    //Test cases for email.
    @Test
    public void email_returnTrue_ifEmailIsProper(){
        result = userRegistration.email("pooja.gaikwad@gmail.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void email_returnFalse_ifEmailIsNotProper(){
        result = userRegistration.email("pooja.gaikwad$blz.co.in");
        Assert.assertFalse(result);
    }

    @Test
    public void email_returnFalse_ifInEmailSingleDotIsNotThere(){
        result = userRegistration.email("pooja.gaikwad@gmail..com");
        Assert.assertFalse(result);
    }

    //Test cases for mobile number.
    @Test
    public void mobileNumber_returnTrue_ifMobileNumberIsProper(){
        result = userRegistration.mobileNumber("91 7008409012");
        Assert.assertTrue(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifMobileNumberIsNotTenDigits(){
        result = userRegistration.mobileNumber("91 700840901");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifNoSpaceAfterCountryCode(){
        result = userRegistration.mobileNumber("917008409012");
        Assert.assertFalse(result);
    }

    @Test
    public void mobileNumber_returnFalse_ifNumberIsStartWithzero(){
        result = userRegistration.mobileNumber("91 0308409012");
        Assert.assertFalse(result);
    }

    //Test cases for password rule1 - minimum 8 characters.
    @Test
    public void password_returnTrue_ifPasswordIsProper(){
        result = userRegistration.password("abcdEF12");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordIsLessThanEightCharacter(){
        result = userRegistration.password("abcdeF1");
        Assert.assertFalse(result);
    }

    //Test cases for password rule2 - atleast one Uppercase.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneUpperCase(){
        result = userRegistration.password("Abced1234");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneUpperCase(){
        result = userRegistration.password("abcedefgh");
        Assert.assertFalse(result);
    }

    //Test cases for password rule 3 - atleast one numeric number.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneNumeric(){
        result = userRegistration.password("Abce1defg1");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneNumeric(){
        result = userRegistration.password("Abcedefghi");
        Assert.assertFalse(result);
    }

    //Test cases for password rule 4 - exactly one special character.
    @Test
    public void password_returnTrue_ifPasswordHavingAleastOneSpecialCharacter(){
        result = userRegistration.password("Abce1defg1@");
        Assert.assertTrue(result);
    }

    @Test
    public void password_returnFalse_ifPasswordNotHavingAleastOneSecialCharacter(){
        result = userRegistration.password("Abcedefghi");
        Assert.assertFalse(result);
    }

    //More test cases for email
    @Test
    public void email_returnTrue_ifEmailContainSymbol(){
        result = userRegistration.email("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void email_returnFalse_ifEmailStartWithDot(){
        result = userRegistration.email(".abc@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void email_returnFalse_ifEmailIsNotUseCharacterUnderscoreDash(){
        result = userRegistration.email("abc()*@gmail.com");
        Assert.assertFalse(result);
    }
}