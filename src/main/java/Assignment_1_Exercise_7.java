/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

import java.util.Scanner;

public class Assignment_1_Exercise_7 {
    public static void main(String[] args) {

        double length,width,Area;

        Scanner sc=new Scanner(System.in);

        //User enters measures

        System.out.print("What is the length of the room in feet? ");
        length=sc.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        width=sc.nextDouble();

        //Calculating formula to find area of room

        Area=length*width;

        System.out.println("You entered dimension of "+length+" feet by "+width+" feet ");

        System.out.println("The area is "+Area+" square feet ");

        // 1 square feet is equal to 0.09290 square meter therefore divide area by 10.764

        Area=Area/10.764;

        System.out.println("The area is "+Area+" square meter ");
    }
}
