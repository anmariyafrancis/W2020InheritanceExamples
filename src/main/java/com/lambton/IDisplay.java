package com.lambton;

public interface IDisplay
{
    public int code =100; // all variables are public,static and final
    void display();       //method cant be public or protected
    default void print(){ //to avoid the over riding of other methods
    }
}
