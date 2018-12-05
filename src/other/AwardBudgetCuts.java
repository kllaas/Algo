package other;

import java.util.Arrays;

public class AwardBudgetCuts {

    public static void main(String[] args) {
            System.out.println(findGrantsCap(new double[]{10,20,30,40,50}, 100));
    }

    static double findGrantsCap(double[] grantsArray, double newBudget) {
        Arrays.sort(grantsArray);

        double shortfall = 0;

        for (int i = 0; i < grantsArray.length; i++) {
            shortfall += grantsArray[i];
        }

        shortfall -= newBudget;

        if (shortfall <= 0) {
            return grantsArray[grantsArray.length - 1];
        }

        double average = (newBudget / grantsArray.length);

        for (int i = 0; i < grantsArray.length; i++) {
            if (grantsArray[i] < average) {
                newBudget -= grantsArray[i];
                average = (newBudget / (grantsArray.length - i - 1));
            } else {
                break;
            }
        }

        return average;
    }

}
