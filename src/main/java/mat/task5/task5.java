package mat.task5;

import mat.task_2.task_2;

public class task5 {

    public static float summator(int n, float value) {

        float sum = 0;

        for (int i = 0; i < 8; i++) {

            if (i != 0){
                n = n * 10;
            }

            for (int j = 1; j <= n; j++) {

                sum += value;
            }
            System.out.printf("%10s | %10s | %12s | %15s|\n", n, sum, exactValue(n, value), task_2.inaccuracy(sum, exactValue(n, value)) * 100);
            sum = 0;
        }
        return sum;
    }

    public static float exactValue(int n, float value){
        float correct = value * n;

        return correct;
    }


    public static void main(String[] args) {

        summator(100, 0.1f);
        System.out.println();
        summator(80, 0.125f);

    }

}
