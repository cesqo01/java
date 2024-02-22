package org.example.sem1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = reverseString(name);
        System.out.println(name);
    }

    private static String reverseString(String name) {
        if (name.length() % 2 != 0) {
            char n = name.charAt(name.length() / 2);
            String half1 = name.substring(0, name.length() / 2);
            String half2 = name.substring((name.length() / 2) + 1);
            name = half2 + n + half1;

        }
        else{
            String half1 = name.substring(0, name.length() / 2);
            String half2 = name.substring(name.length() / 2);
            name = half2 + half1;
        }
        return name;
    }
}
