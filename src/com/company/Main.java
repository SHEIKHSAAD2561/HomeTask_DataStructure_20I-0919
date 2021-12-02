package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grades;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Grades of Student");
        grades=sc.nextInt();
        if(grades>80 && grades<=100)
        {
            System.out.println("You have 'A' Grade");
        }
        else if (grades<80 && grades>=70)
        {
            System.out.println("You have 'B' Grade");
        }
        else if(grades>60 && grades<70)
        {
            System.out.println("You have 'C' Grade");
        }
        else if(grades<=60)
        {
            System.out.println("You have 'D' Grade");
        }
        else if(grades<33)
        {
            System.out.println("You have 'F' Grade");
        }
        else
        {
            System.out.println("you have Entered a Wrong Number");
        }
    }
}
