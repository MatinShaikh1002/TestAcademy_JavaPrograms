package October.Program;

import java.util.Scanner;

public class CalculateGrade {


    public static void main(String[] args) {

        // If score>=90 and <=100--> Grade A
        // If score>=80 and <=89--> Grade B
        // If score>=70 and <=79--> Grade c
        // If score>=60 and <=59--> Grade D
        // If score>=50 and <=49--> Grade E
        // If score <=0 and >100--> Grade F


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        int score=sc.nextInt();
        char grade='F';
        if(score>=90 && score<=100){

            grade='A';
        }
        else if (score>=80 && score<=89){

            grade='B';
        }
        else if (score>=70 && score<=79){

            grade='C';
        }
        else if (score>=60 && score<=59){

            grade='D';
        }
        else if (score>=50 && score<=49){

            grade='E';
        }
        else if (score<=0 || score>100){

            grade= 'O';
        }

        else{

            grade='F';
        }

        System.out.println("Your grade is-->"+grade);





    }
}
