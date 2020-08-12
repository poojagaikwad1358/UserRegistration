package com.bridgelab;

public class UserRegistration {
    //Method for checking first name
    public boolean firstName (String firstName) {
        return firstName.matches("^[A-Z]{1}[a-zA-Z]{3,}");
    }

    //Method for checking last name
    public boolean lastName (String lastName) {
        return lastName.matches("^[A-Z]{1}[a-zA-Z]{3,}");
    }
}


