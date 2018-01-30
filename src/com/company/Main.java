//Create a program that allows users to select from one of four options of shapes that they would like to get the area for. Accept the input from the user, and provide the results.

// Hints:
//Create 4 separate methods, and call the method based on the menu choice. (Suggested approach, menu - switch case calling the method)

package com.company;
import java.util.Scanner;// import package for user input
public class Main {

    public static void main(String[] args) {
// -------------- declare/initialize main variables ----------------
        int number; // ---- user input Main Menu --------------
        Scanner input = new Scanner(System.in);// -------------Initialize input for do:while loop---------------
        do{
            System.out.println("Calculate area for various plane shapes");
            System.out.println("1. Square ");
            System.out.println("2. Circle");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.println("Enter 1-4;");
            number = input.nextInt();
        }while(number !=1 && number != 2 && number != 3 && number !=4);
//---------------- switch case for user reply --------------------
        switch (number) {
            // -------- call selected method  -----
            case 1:
                squareArea();
                break;
            case 2:
                circleArea();
                break;
            case 3:
                rectangleArea();
                break;
            case 4:
                triangleArea();
        }

    }
    // ------------- define all methods below this section ----------------------
    private static void squareArea () {
        Scanner input = new Scanner(System.in); // Initialize input for void function
        System.out.println("Square");
        System.out.println("Enter the x-axis in cm: ");
        Double x = input.nextDouble();
        String xNum = String.format("%.2f",(x * x)); // format String variable for display of 2 decimals ----------
        System.out.println("The area of a " + x + " cm by " + x + " cm square is " +  xNum + " sq. cm");

    }
    private static void circleArea () {
        Scanner input = new Scanner(System.in);
        System.out.println("Circle");
        System.out.println("Enter the diameter of the circle in cm: ");
        Double x = input.nextDouble();
        String xNum = String.format("%.2f",(Math.PI / 4) * Math.pow(x, 2.0));
        System.out.println("The area of a " + x + " cm diameter circle is " + xNum + " sq. cm" );
    }
    private static void rectangleArea () {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle");
        System.out.println("Enter the x-axis (horizontal) in cm: ");
        Double x = input.nextDouble();
        System.out.println("Enter the y-axis (vertical) in cm: ");
        Double y = input.nextDouble();
        String xNum = String.format("%.2f", (x * y));
        System.out.println("The area of a " + x + " cm by " + y + " cm rectangle is " + xNum + " sq. cm");
    }
    private static void triangleArea () {
        Scanner input = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.println("Enter the base of the triangle in cm: ");
        Double x = input.nextDouble();
        System.out.println("Enter the height of the triangle in cm: ");
        Double y = input.nextDouble();
        String xNum = String.format("%.2f", (.5 * x * y));
        System.out.println("The area of a " + x + " cm wide by " + y + " cm high triangle is " + xNum + " sq. cm");
    }
}
