package mat.task6;

import java.util.ArrayList;

public class task6 {

    private class Arrays{
        ArrayList<Float> positiveValues;
        ArrayList<Float> negativeValues;

        public Arrays(ArrayList<Float> positiveValues, ArrayList<Float> negativeValues){
            this.positiveValues = positiveValues;
            this.negativeValues = negativeValues;
        }
    }

    public static ArrayList<Float> allValues(int n){

        ArrayList<Float> listOfValues = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            listOfValues.add ((float) (-Math.pow(- 1, i) * 1 / i));
        }
        //System.out.println(listOfValues);

        return listOfValues;
    }


    public Arrays subtraction(int n){
        ArrayList<Float> positiveValues = new ArrayList<>();
        ArrayList<Float> negativeValues = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            float result = (float) (-Math.pow(- 1, i) * 1 / i);
            if (result > 0) {
                positiveValues.add(result);
            }
            else {
                negativeValues.add(result);
            }
        }
        //System.out.println(positiveValues);
        //System.out.println(negativeValues);
        return new Arrays(positiveValues, negativeValues);

    }

    public static float sumLeftToRight(ArrayList<Float> listOfTerms){

        float sum = 0;

        for (int i = 0; i < listOfTerms.size(); i++){
            sum = sum + listOfTerms.get(i);
        }

        return sum;
    }

    public static float sumRightToLeft(ArrayList<Float> listOfTerms){
        float sum = 0;
        for (int i = listOfTerms.size() - 1; i >= 0; i--){
            sum = sum + listOfTerms.get(i);
        }

        return sum;
    }




    public static double inaccuracy(float pfloat, double pdouble) {
        return Math.abs(pfloat - pdouble) / pdouble;
    }

    public static void main(String[] args) {
        int n = 1000000;
        task6 classObject = new task6();
        System.out.println("float");
        System.out.println(sumLeftToRight(allValues(n)));
        System.out.println(sumLeftToRight(classObject.subtraction(n).positiveValues) + sumLeftToRight(classObject.subtraction(n).negativeValues));
        System.out.println(sumRightToLeft(allValues(n)));
        System.out.println(sumRightToLeft(classObject.subtraction(n).positiveValues) + sumRightToLeft(classObject.subtraction(n).negativeValues));

        System.out.println("double");
        System.out.println((double)sumLeftToRight(allValues(n)));
        System.out.println((double)sumLeftToRight(classObject.subtraction(n).positiveValues) + sumLeftToRight(classObject.subtraction(n).negativeValues));
        System.out.println((double)sumRightToLeft(allValues(n)));
        System.out.println((double)sumRightToLeft(classObject.subtraction(n).positiveValues) + sumRightToLeft(classObject.subtraction(n).negativeValues));

        System.out.println("погрешность");
        System.out.println(inaccuracy(sumLeftToRight(allValues(n)), (double)sumLeftToRight(allValues(n))));
        System.out.println(inaccuracy(sumLeftToRight(classObject.subtraction(n).positiveValues) + sumLeftToRight(classObject.subtraction(n).negativeValues), (double)sumLeftToRight(classObject.subtraction(n).positiveValues) + sumLeftToRight(classObject.subtraction(n).negativeValues)));
        System.out.println(inaccuracy(sumRightToLeft(allValues(n)), (double)sumRightToLeft(allValues(n))));
        System.out.println(inaccuracy(sumRightToLeft(classObject.subtraction(n).positiveValues) + sumRightToLeft(classObject.subtraction(n).negativeValues), (double)sumRightToLeft(classObject.subtraction(n).positiveValues) + sumRightToLeft(classObject.subtraction(n).negativeValues)));
    }

}

