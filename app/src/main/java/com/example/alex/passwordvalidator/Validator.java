package com.example.alex.passwordvalidator;

public class Validator {
    public Validator(){}
    private String password;
    public void setPassword(String s){
        this.password = s;
    }

    //validate returns an int of how many tests passed.
    public int validate(){
        int numCases = 0;
        if (this.password.isEmpty()){
            return numCases;
        }
        if (!this.password.equalsIgnoreCase("password")){
           numCases++;
        }
        if (this.password.length() >= 8){
            numCases++;
        }
        return numCases;
    }
}
