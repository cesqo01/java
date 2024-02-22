package org.example.sem1;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sumArr = arrSumElems(arr);
        for (int i = 0; i < sumArr.length; i++) {
            System.out.println("sumArr[i] = " + sumArr[i]);
        }
     }

    private static int[] arrSumElems(int[] arr) {
        int [] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i] + arr[i - 1];
        }
        return result;
    }
}