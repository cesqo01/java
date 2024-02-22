package org.example.sem1;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length n: ");
        int n = scanner.nextInt();

        System.out.println(getCount(n));
    }

    /**
     * @param n length
     * @return count of +numbers
     * @apiNote количество положительных чисел, после которых следует отрицательное число в последовательности
     */
    private static int getCount(int n) {
        Scanner scanner = new Scanner(System.in);
        int current_num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int next_num = scanner.nextInt();
            if (current_num > 0 && next_num < 0) {
                    count++;
            }
            current_num = next_num;
        }
        return count;
    }
}
