package October.Program;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        // If three sides are equal--> Equailateral Triangle
        // If any Two sides are equal --> Isosalece Triangle
        // If no sides are equal--> Scalene triangle


        // Input--> side1, side2, side3 in decimal
        // Output--> Equailateral/Isosalece/Scalene

        // Logic

        // If (side1==side2) && (side2==side3) && (side1==side3)--> Equailateral
        // If (side1==side2) && (side2==side3)-->Isosalece
        // else--> Scalene

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1 of triangle::");
        double side1=sc.nextDouble();
        System.out.println("Enter side 2 of triangle::");
        double side2=sc.nextDouble();
        System.out.println("Enter side 3 of triangle::");
        double side3=sc.nextDouble();

        if((side1==side2) && (side2==side3) && (side1==side3)){

            System.out.println("Equailateral Triangle");
        }

        else if((side1==side2) && (side2==side3)){

            System.out.println("Isosalece Triangle");
        }

        else{

            System.out.println("Scalene Triangle");
        }


    }
}
