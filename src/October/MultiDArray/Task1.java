package October.MultiDArray;

public class Task1 {

    public static void main(String[] args) {

        // Create 2D Array rows*cols
        int matrix[][]={{90,91},{1,2},{7,8}};
        System.out.println("matrix length-->"+matrix.length);

        // rows=3 matrix.length
        for (int i = 0; i < matrix.length ; i++) {

            // col=3-->matrix[0].length
            for (int j = 0; j < matrix[j].length; j++) {

                System.out.print(matrix[i][j]+" ");

            }

            System.out.println();

        }





    }
}
