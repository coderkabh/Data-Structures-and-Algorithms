package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);

        for (int element: arr){
            System.out.print(element+" ");
        }
    }

    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
