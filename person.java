package com.example.android.miwok;

public class person {
    private String name;
    //make the Age age use a small
    private int Age;
    private String gender;
    //good job by writing setName but write a setAge and setGender
    public void setName(String name1){
        name=name1;
    }
    public String getGender(){
        return gender;
    }

    public String getName() {
        return name;
    }
    public int getAge()
    {return Age;
    }

    public String id(){
        return getName()+"is"+getAge()+" years old and is"+getGender();
    }
    public  String id(String name, int idNumber){
        return name+"id number is "+idNumber;
    }

}
