/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author John
 */
public class Freshman extends Student {

    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }
    
    public String toString(){
        return "Freshman " 
                + super.getName() 
                + " Age: " + super.getAge() 
                + " Credits: " + super.getCredits()
                + " GPA: " + super.getGPA();
    }
}
