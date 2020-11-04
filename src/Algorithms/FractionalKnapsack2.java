package Algorithms;

import java.util.*;

public class FractionalKnapsack2 {
    private static double knapsack(int[] weight, int[] value, int capacity) {
        Pair[] iValue = new Pair[weight.length];

        for (int i = 0; i < weight.length; i++) {
            iValue[i] = new Pair(weight[i], value[i], i);
        }
        
        Arrays.sort(iValue, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b)
            {
                return b.cost.compareTo(a.cost);
            }
        });

        double totalValue = 0d;
        for (Pair i : iValue) {

            int currentWeight = (int)i.weight;
            int curVal = (int)i.value;

            if (capacity - currentWeight >= 0){
                capacity = capacity - currentWeight;
                totalValue += curVal;
            }
            else {
                double fraction
                        = ((double)capacity / (double)currentWeight);
                totalValue += (curVal * fraction);
                capacity
                        = (int)(capacity - (currentWeight * fraction));
                break;
            }
        }

        return totalValue;
    }
    
    static class Pair {
        Double cost;
        double weight, value, index;

        public Pair(int weight, int value, int index) {
            this.weight = weight;
            this.value = value;
            this.index = index;
            cost = (double)value / (double)weight;
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = scan.nextInt();
        int[] weight = new int[size];
        System.out.println("Enter the weights");
        for (int i = 0; i < size; i++) {
            weight[i] = scan.nextInt();
        }

        System.out.println("Enter the value");
        int[] value = new int[size];
        for (int i = 0; i < size; i++) {
            value[i] = scan.nextInt();
        }
        System.out.println("Enter the capacity");
        int capacity = scan.nextInt();

        double maximumValue = knapsack(weight, value, capacity);
        System.out.println(maximumValue);
    }
}
