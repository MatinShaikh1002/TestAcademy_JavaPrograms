package October.Program;

import java.util.Scanner;

public class FindMaxElement {

    public static void main(String[] args) {

        // Take element from User
        int elements[]={25,14,56,15,36,56,77,18,29,14};
        int maxValue=give_MaxElement(elements);
        System.out.println(maxValue);

    }

    public static int give_MaxElement(int elements[]){

        int max= elements[0];
        for (int i = 0; i <elements.length ; i++) {

            if(elements[i]>max){

                max=elements[i];
            }
        }

        return max;

    }


}
