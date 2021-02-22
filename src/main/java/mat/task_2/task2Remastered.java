package mat.task_2;

public class task2Remastered {
    public static float functionAlgorithm(float x){

        float s = 1,
                a = x,
                n = 1;


        while (s + a != s) {
            s = s + a;
            n = n + 1;
            a = a * x / n;
        }
        return s;
    }

    public static float inaccuracy(float algorithm, float embedded) {
        return Math.abs(algorithm - embedded) / embedded;
    }

    public static void main(String[] args) {

        System.out.format("%5s%16s%30s%32s", "x", "алгоритм", "встроенная", "относительная погрешность\n");


        for (float x = -25; x <= 25; x = x + 5) {
            if (x < 0){
                float s = 1 / functionAlgorithm(x * (-1));
                System.out.format("%5s%16s%30s%32s", x, s, (float) Math.exp(x), inaccuracy(s, (float) Math.exp(x)) + "\n");
            }
            else {
                System.out.format("%5s%16s%30s%32s", x, functionAlgorithm(x), (float) Math.exp(x), inaccuracy(functionAlgorithm(x), (float) Math.exp(x)) + "\n");
            }
        }

    }
}
