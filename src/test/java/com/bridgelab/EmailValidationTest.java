package com.bridgelab;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    UserRegistration userRegistration = new UserRegistration();
    private final String keys;
    private final boolean values;

    public EmailValidationTest(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }

    //Test cases for email
    @Parameterized.Parameters
    public static Collection<Object[]> testCasesForEmail() {
        Object[][] testingEmails = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.net", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {".abc@gmail.com", false},
                {"alice.@example.c", false},
                {"alice@example.dd..com", false},
                {"alice:;@example.com", false},
                {"?alice.@example.com", false}
        };
        return Arrays.asList(testingEmails);
    }

    @Test
    public void validEmail() {
        boolean result = userRegistration.validateEmail(keys);
        Assert.assertEquals(result, values);
    }
}
