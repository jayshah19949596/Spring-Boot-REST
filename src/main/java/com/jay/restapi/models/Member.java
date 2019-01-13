package com.jay.restapi.models;

public class Member
{
    private int id;
    public String firstName;
    public String lastName;

    public  Member(int id, String fName, String lName)
    {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }

}
