package org.example.sem1;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isaPalindrom(arr));

    }

    private static boolean isaPalindrom(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
