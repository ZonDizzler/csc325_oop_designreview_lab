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
public class Senior extends Student {

    public Senior(String name, int age, int credits) {
        super(name, age, credits);

        setCredits(credits);
    }

    @Override
    public void setCredits(int credits) {
        
        //credits for seniors must be above 85
        if (credits >= 85) {

            super.setCredits(credits);
        }

        if (credits >= 85) {

            super.setCredits(credits);
        } else {
            System.out.println("Seniors must have above 85 credits");

        }
    }

    public String toString() {
        return "Senior "
                + super.getName()
                + " Age: " + super.getAge()
                + " Credits: " + super.getCredits()
                + " GPA: " + super.getGPA();
    }

}
