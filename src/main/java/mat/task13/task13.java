package mat.task13;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixFormat;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        Scanner numberOperation = new Scanner(System.in);
        System.out.print("№ ");
        int operation = numberOperation.nextInt();

        RealMatrix matrixMat = MatrixUtils.createRealMatrix(matrix);
        RealMatrixFormat matrixFormat = new RealMatrixFormat("","","","","\n","   ");

        switch (operation){
            case (1):
                System.out.println(matrixFormat.format(matrixMat.transpose()));
                break;

            case (2):
                System.out.print("Введите число ");
                double multiplier = numberOperation.nextDouble();
                System.out.println(matrixFormat.format(matrixMat.scalarMultiply(multiplier)));
                break;

            case (3):
                double[][] matrix2 = {
                        {1, 1, 1},
                        {1, 1, 1}
                };
                RealMatrix matrixMat2 = MatrixUtils.createRealMatrix(matrix2);
                System.out.println(matrixFormat.format(matrixMat.add(matrixMat2)));
                break;

            case (4):
                double[][] matrix3 = {
                        {1, 1, 1},
                        {1, 1, 1}
                };
                RealMatrix matrixMat3 = MatrixUtils.createRealMatrix(matrix3);
                System.out.println(matrixFormat.format(matrixMat.subtract(matrixMat3)));
                break;

            case (5):
                double[][] matrix4 = {
                        {2, 2},
                        {2, 2},
                        {2, 2}
                };
                RealMatrix matrixMat4 = MatrixUtils.createRealMatrix(matrix4);
                System.out.println(matrixFormat.format(matrixMat.multiply(matrixMat4)));
                break;

//            case (6):
//                System.out.println(matrixFormat.format(matrixMat.));
//                break;
        }
    }
}
