package mat.task6;

import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Float> listOfTerms = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            listOfTerms.add ((float) (-Math.pow(- 1, i) * 1 / i));
        }
        System.out.println(listOfTerms);
    }

}
