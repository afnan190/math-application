package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//        1. Create two variables to represent the salary for Bob and Gary, name them
//        bobSalary and garySalary. Create a new variable named
//        highestSalary. Determine which salary is greater using Math.max() and
//        store the answer in highestSalary. Set the initial salary variables to any value
//        you want. Print the answer (i.e "The highest salary is ...")
        int bobSalary = 20000;
        int garySalary = 30000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

//        2. Find and display the smallest of two variables named carPrice and
//        truckPrice. Set the variables to any value you want.
        int carPrice = 5000;
        int truckPrice = 10000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);

//        3. Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The Area is " + area);

//        4. Find and display the square root of a variable after it is set to 5.0
        double var = 5.0;
        double sqrt = Math.sqrt(var);
        System.out.println("Square Root is: " + sqrt
        );
//        5. Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Distance is: " + distance);

//        6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        double value1 = (-3.8);
        double value2 = Math.abs(value1);
        System.out.println("Absolute value of -3.8 is: " + value2);

//        7. Find and display a random number between 0 and 1
//        int a = 0;
//        int b = 1;
        double rand = Math.random();
        System.out.println("Random Number: " + rand);

//        8. Calculate how many minutes are in 24 days, use a variable for each value you
//        calculate with. BONUS: How many milliseconds

        int days = 24;
        int hoursDays = 24;
        int minutesHour = 60;
        int totalMinutes = (days * hoursDays * minutesHour);
        System.out.println("The number of minutes in 24 days is: " + totalMinutes );



        }
    }