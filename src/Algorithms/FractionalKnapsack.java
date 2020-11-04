package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = scan.nextInt();

        int[][] array = new int[size][2];

        System.out.println("Enter the value and weights");
        for(int i=0;i<size;i++){
            for (int j = 0; j < 2; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the knapsack Quantity");
        int quantity = scan.nextInt();

        System.out.println(fractionalKnapsack(array,quantity));

    }

    public static double fractionalKnapsack(int[][] array, int knapsackSize){

        // 0 - value
        // 1 - weight
        Arrays.sort(array,(a,b)-> Integer.compare(a[0],b[10]));

        double maxWeight = 0d;
        for (int[] set : array) {

            int currentWeight = set[1];
            int curValue = set[0];

            if (knapsackSize - currentWeight >= 0)
            {

                knapsackSize = knapsackSize - currentWeight;
                maxWeight += curValue;
            }
            else
            {
                // item cant be picked whole
                double fraction = ((double)knapsackSize / (double)currentWeight);
                maxWeight += (curValue * fraction);
                knapsackSize = (int)(knapsackSize - (currentWeight * fraction));
                break;
            }
        }

        return maxWeight;
    }
}
