package com.remijonathan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        double area = 0;

        do {
            System.out.println("Geometry Calculator\n" +
                    "1. Calculate the Area of a Circle\n" +
                    "2. Calculate the Area of a Rectangle\n" +
                    "3. Calculate the Area of a Triangle\n" +
                    "4. Quit\n " +
                    "\n" +
                    "Enter your choice (1-4)");

            switch (input.nextInt()) {
                case 1:
                    System.out.println("What is the radius of the circle?");
                    area = getArea(input.nextDouble());
                    break;
                case 2:
                    System.out.println("What is the width of the rectangle?");
                    double width = input.nextDouble();

                    System.out.println("What is the length of the rectangle?");
                    double length = input.nextDouble();

                    area = getArea(width, length);
                    break;
                case 3:
                    System.out.println("What is the base of the triangle?");
                    float base = input.nextFloat();

                    System.out.println("What is the length of the height?");
                    double height = input.nextDouble();

                    area = getArea(base, height);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("The area of the shape is " + area);
        } while (true);
    }

    //Circle
    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //Rectangle
    public static double getArea(double width, double height) {
        return width * height;
    }

    //Triangle
    public static double getArea(float base, double length) {
        return base * length * 0.5;
    }

}
