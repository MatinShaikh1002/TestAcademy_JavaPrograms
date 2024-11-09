package October.SwitchCase;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Day");
        int day=sc.nextInt();

        switch (day){

            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("SUN");
                break;

            default:
                System.out.println("NOTHING");


        }


    }
}
