package com.bridgelab;

public class UserRegistration {
    public boolean firstName (String firstName) {
        return firstName.matches("^[A-Z]{1}[a-zA-Z]{2,}");
    }
}


