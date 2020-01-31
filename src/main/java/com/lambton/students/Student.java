package com.lambton.students;

import com.lambton.person.Person;

public class Student extends Person
{
    public String gender;
    private String courseName;
    private String collegeName;
    private int totalMarks;

    public Student(int id, String name, String gender, String courseName, String collegeName, int totalMarks)
    {
        super(id, name, gender);
        this.courseName = courseName;
        this.collegeName = collegeName;
        this.totalMarks = totalMarks;
        super.gender="Hello";
        this.gender="Test";
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCollegeName()
    {
        return collegeName;
    }

    public void setCollegeName(String collegeName)
    {
        this.collegeName = collegeName;
    }

    public int getTotalMarks()
    {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks)
    {
        this.totalMarks = totalMarks;
    }

   // public  abstract void testing();

    @Override
    public void display()
    {
        System.out.println("I am from student");
    }

    @Override
    protected void finalize() throws Throwable { //destructor
        super.finalize();

        System.out.println("finalize()I am from student");
    }
}
