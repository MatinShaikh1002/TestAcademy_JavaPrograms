package October.SwitchCase;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();


        switch (browser) {
            case "chrome":
                System.out.println("starting the chrome");
                break;

            case "firefox":
                System.out.println("starting the firefox");
                break;

            case "edge":
                System.out.println("starting the chrome");
                break;

            default:
                System.out.println("Invalid Browser");
        }
    }

}
