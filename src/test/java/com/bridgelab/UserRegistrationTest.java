package com.bridgelab;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    UserRegistration userRegistration = new UserRegistration();
    boolean result;

    //Test cases for first name
    @Test
    public void firstName_returnsTrue_ifFirstNameProper() {
        result = userRegistration.firstName("Pooja");
        Assert.assertTrue(result);
    }

    @Test
    public void firstName_returnsFalse_ifNumberOfCharDoesNotMatch() {
        result = userRegistration.firstName("Po");
        Assert.assertFalse(result);
    }

    @Test
    public void firstName_returnFalse_ifFirstCharNotUppercase(){
        result = userRegistration.firstName("pooja");
        Assert.assertFalse(result);
    }

    //Test cases for last name
    @Test
    public void lastName_returnsTrue_ifLastNameProper() {
        result = userRegistration.lastName("Gaikwad");
        Assert.assertTrue(result);
    }

    @Test
    public void lastName_returnsFalse_ifNumberOfCharDoesNotMatch() {
        result = userRegistration.lastName("Ga");
        Assert.assertFalse(result);
    }

    @Test
    public void lastName_returnFalse_ifFirstCharNotUppercase(){
        result = userRegistration.lastName("gaikwad");
        Assert.assertFalse(result);
    }
}