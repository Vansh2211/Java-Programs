// We are solving using Greedy approach

import java.util.*;

class FractionalKnapsack{

    static class ItemComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            double a1 = (1.0 * a[0]) / a[1];
            double b1 = (1.0 * b[0]) / b[1];
            return Double.compare(b1, a1);
        }
    }

    static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] items = new int[n][2];

        for (int i = 0; i < n; i++) {
            items[i][0] = values[i]; // value
            items[i][1] = weights[i]; // weight
        }

        Arrays.sort(items, new ItemComparator());

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity == 0) break;

            if (items[i][1] <= capacity) {
                totalValue += items[i][0];
                capacity -= items[i][1];
            } else {
                totalValue += (double) items[i][0] * capacity / items[i][1];
                capacity = 0;
            }
        }

        return totalValue;
    }


        public static void main(String[] args){
            int[] values = {60, 100, 120};
            int[] weights = {10, 20, 30};
            int capacity = 50;

            double maxValue = fractionalKnapsack(values, weights, capacity);
            System.out.println("Maximum value in Knapsack = " + maxValue);
        }

    
    }