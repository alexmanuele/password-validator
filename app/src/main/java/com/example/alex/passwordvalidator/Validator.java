package com.example.alex.passwordvalidator;

public class Validator {
    public Validator(){}
    private String password;
    public void setPassword(String s){
        this.password = s;
    }
    public String getPassword(){
        return this.password;
    }

    //validate returns an int of how many tests passed.
    public int validate(){
        int strength = 0;

        if (getPassword().isEmpty())
            return strength;
        if (isNotPassword())
            strength++;
        if(hasEightChars())
            strength++;
        if(hasSpecialChar())
            strength++;
        if(hasNumAndChar())
            strength++;
        if(hasUpperAndLowerCase())
            strength++;

        return strength;
    }
    private boolean isNotPassword(){
        if (getPassword().equalsIgnoreCase("password")){
            return false;
        }
        return true;
    }
    private boolean hasEightChars(){
        if(getPassword().length() >= 8){
            return true;
        }
        return false;
    }
    private boolean hasSpecialChar(){
        char[] specials = {'!', '@', '#', '$', '%', '^', '&', '*', '(',
                ')', '_', '-', '+', '=', '<', '>', '?', '{', '[', '}', ']',
                '/', '~', '`', ':', ';'};
        for (int i = 0; i < getPassword().length(); i++){
            for (int j = 0; j < specials.length; j++){
                if (getPassword().charAt(i) == specials[j]){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean hasNumAndChar(){
        boolean hasNum = false;
        boolean hasChar = false;
        if (getPassword().matches(".*\\d.*"))
            hasNum = true;
        if (getPassword().matches(".*[a-zA-Z].*"))
            hasChar = true;
        if (hasNum && hasChar)
            return true;
        return false;

    }
    private boolean hasUpperAndLowerCase(){
        boolean hasUpper = false;
        boolean hasLower = false;
        if(getPassword().matches(".*[A-Z].*"))
            hasUpper = true;
        if(getPassword().matches(".*[a-z].*"))
            hasLower = true;
        if(hasUpper && hasLower)
            return true;
        return false;
    }
}
