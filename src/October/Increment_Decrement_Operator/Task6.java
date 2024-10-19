package October.Increment_Decrement_Operator;

public class Task6 {

    public static void main(String[] args) {

        int a=10;
        System.out.println(a++ + ++a);
       // Assign the value first a++--> 10 then 11
        // a++--> Assign the value first a++-->10
        // Then increment a--> a=11
        // ++a --> Latest value of a=11 hence ++a=12

        // output a++-->10 + ++a-->12 = 22




    }
}
