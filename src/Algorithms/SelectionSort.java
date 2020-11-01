package Algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
