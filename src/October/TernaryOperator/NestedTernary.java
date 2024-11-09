package October.TernaryOperator;

public class NestedTernary {

    public static void main(String[] args) {

        // Grade system
        // score>=90-->A grade
        //score>=80-->B grade
        //score>=70-->C grade
        //score>=60-->D grade
        //score <60-->F grade

        int score=50;
        String result=
                (score>=90) ? "A Grade":
                (score>=80) ? "B Grade":
                (score>=70) ? "C Grade":
                (score>=60) ? "D Grade":
                "F Grade";
        System.out.println(result);


    }
}
