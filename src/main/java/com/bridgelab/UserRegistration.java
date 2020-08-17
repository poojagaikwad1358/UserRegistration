package com.bridgelab;

public class UserRegistration {
    //Method for checking first name and last name.
    public boolean validateName (String name) {
        String patternName = "^[A-Z]{1}[a-zA-Z]{3,}";
        if (name.matches(patternName)) {
            return true;
        }
        else {
            return false;
        }
    }

    //Method for checking email.
    public boolean validateEmail (String email) {
        String patternEmail = "^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$";
        if (email.matches(patternEmail)) {
            return true;
        }
        else {
            return false;
        }
    }

    //Method for checking mobile number.
    public boolean validateMobileNumber (String mobileNumber){
        String patternMobileNumber = "^[0-9]{2}[ ][1-9]{1}[0-9]{9}";
        if (mobileNumber.matches(patternMobileNumber)){
            return true;
        }
        else {
            return false;
        }
    }

    //Method for checking valid password.
    public boolean validatePassword (String password) {
        String patternPassword = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.?/~`_+-=|].).{8,}$";
        if (password.matches(patternPassword)) {
            return true;
        }
        else {
            return false;
        }
    }
}


