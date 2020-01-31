package com.lambton.faculty;

import com.lambton.person.Person;

public class Faculty extends Person
{

    String designation;
    int totalSalary;

    public Faculty(int id, String name, String gender, String designation, int totalSalary) {
        super(id, name, gender);
        this.designation = designation;
        this.totalSalary = totalSalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public void display() {

    }
}
