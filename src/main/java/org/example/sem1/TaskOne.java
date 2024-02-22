package org.example.sem1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.println(resultPrMinus(num));
    }

    /**
     * @apiNote description
     * @return provenience - summa chisel n
     */
    public static int resultPrMinus(int n) {
        int eq = 1; //todo: rename
        int sum = 0; //todo: rename
        while (n != 0) {
            int remain = n % 10;
            eq *= remain;
            sum += remain;
            n /= 10;
        }
        return eq - sum;
    }
}

