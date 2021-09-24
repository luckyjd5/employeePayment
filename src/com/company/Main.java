package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalWage = 0;

        System.out.println("Enter the employees name:");
        String empName = input.next();

        System.out.println("How many hours have they worked:");
        int workHours = input.nextInt();

        System.out.println("What is their hourly wage:");
        double hourWage = input.nextDouble();

        if (workHours > 45) {
            int overTime = workHours - 45;
            totalWage = (45 * hourWage) + (overTime * (hourWage * 1.5));
        }
        else {
            totalWage = workHours * hourWage;
        }
        double wageAT = totalWage * 0.8;
        System.out.println(empName + " will get " + "hours pay a week.");
        System.out.println("Before tax: " + totalWage + "\nAfter tax: " + wageAT + ".");
    }
}
