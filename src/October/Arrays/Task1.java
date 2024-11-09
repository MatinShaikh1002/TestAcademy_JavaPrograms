package October.Arrays;

public class Task1 {

    public static void main(String[] args) {

        //create array
        int [] marks= {50, 30, 60,90,80};

        // find the length of array
        System.out.println(marks.length);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Output= 50, 30, 60,90,80}
        System.out.println(marks[5]); //ArrayIndexOutOfBoundsException

    }



}
