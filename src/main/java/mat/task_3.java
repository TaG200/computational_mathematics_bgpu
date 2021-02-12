package mat;

public class task_3 {
    public static void main(String[] args) {

        double p = 2 * Math.sqrt(2);

        for(int n = 2; n < 60; n++){
            p = Math.pow(2, n) * Math.sqrt(2 * (1 - Math.sqrt(1 - Math.pow(p / Math.pow(2, n), 2))));


            System.out.println("При n" + (n + 1) + " p = " + p + "  Погрешность = " + task_2.inaccuracy((float) p, (float) Math.PI));
        }

    }
}
