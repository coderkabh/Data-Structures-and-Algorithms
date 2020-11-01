package Algorithms;

import java.util.Scanner;

public class PalindromicArray {
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int test = scan.nextInt();

            for(int t=0; t<test; t++){
                int s = scan.nextInt();
                int[] arr = new int[s];
                for(int i=0;i<s;i++){
                    arr[i] = scan.nextInt();
                }

                int c=0;
                int i=0;
                int j = s-1;
                while(i<j){
                    if(arr[i]<arr[j]){
                        arr[i+1] += arr[i];
                        i++;
                        c++;
                    }
                    else if(arr[j]<arr[i]){
                        arr[j-1] += arr[j];
                        j--;
                        c++;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
                System.out.println(c);
            }
        }
}
