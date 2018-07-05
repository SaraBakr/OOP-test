package com.example.android.miwok;

import android.util.Log;

public class student extends person {

    public String StudentInfo(int year , String department)
    {
       return super.getName()+super.getAge()+super.id();

    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getGender() {
        return super.getGender();

    }
}
