package com.lambton;

import com.lambton.students.Student;

public class PartTimeStudent extends Student
{
    int noOfDays;

    public PartTimeStudent(int id, String name, String gender, String courseName, String collegeName, int totalMarks, int noOfDays)
    {
        super(id, name, gender, courseName, collegeName, totalMarks);
        this.noOfDays = noOfDays;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }
}
