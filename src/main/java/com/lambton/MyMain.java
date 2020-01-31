package com.lambton;

import com.lambton.person.Person;
import com.lambton.students.Student;

public class MyMain {
    public static void main(String[] args) {
        Person p1=new Person(1,"Anmariya","Female");
        Student s1=new Student(1,"Anmariya","Female","MADT","Lambton",80);

        PartTimeStudent ps1=new PartTimeStudent(1,"Aldin","Male","MADT","Lambton",70,3);
        //ps1.display();
       /* p1=s1;
        p1.display();

        p1=ps1;
        p1.display();*/

        IDisplay iDisplay;

        iDisplay=p1;
        iDisplay.display();
        iDisplay=s1;
        iDisplay.display();
        iDisplay=ps1;
        iDisplay.display();

    }
}
