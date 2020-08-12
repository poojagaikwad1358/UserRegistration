package com.bridgelab;

public class UserRegistration {
    //Method for checking first name.
    public boolean firstName (String firstName) {
        return firstName.matches("^[A-Z]{1}[a-zA-Z]{3,}");
    }

    //Method for checking last name.
    public boolean lastName (String lastName) {
        return lastName.matches("^[A-Z]{1}[a-zA-Z]{3,}");
    }
    //Method for checking email.
    public boolean email (String email) {
        return email.matches("^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$");
    }

    //Method for checking mobile number.
    public boolean mobileNumber (String mobileNumber){
        return mobileNumber.matches("^[0-9]{2}[ ][1-9]{1}[0-9]{9}");
    }

    //Method for checking valid password.
    public boolean password (String password) {
        return password.matches("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.?/~`_+-=|].).{8,}$");
    }
}


