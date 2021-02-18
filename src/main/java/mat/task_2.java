package mat;

public class task_2 {

    public static float s(float x){
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
        return Math.abs(algorithm - embedded) / Math.abs(algorithm);
    }

    public static void main(String[] args) {

        System.out.format("%5s%16s%30s%32s", "x", "алгоритм", "встроенная", "относительная погрешность\n");


        for (float x = -25; x <= 25; x = x + 5) {
            System.out.format("%5s%16s%30s%32s", x, s(x), (float) Math.exp(x), inaccuracy(s(x), (float) Math.exp(x)) + "\n");
        }

    }
}
