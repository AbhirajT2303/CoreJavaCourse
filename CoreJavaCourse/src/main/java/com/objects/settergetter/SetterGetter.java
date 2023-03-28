package com.objects.settergetter;
//Assigning values using Setter and getter

public class SetterGetter {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
}
