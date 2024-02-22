package org.example.finaldz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    //Добавление контакта и номера
    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    //Поиска контакта
    public void find() {
        System.out.println("Введите имя контакта, который хотите найти:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phoneList = phoneBook.get(name);
            for (int i = 0; i < phoneList.size(); i++) {
                System.out.println("id " + i + ": " + phoneList.get(i));
            }
        } else {
            System.out.println("Контакта с именем " + name + " нет в списке контактов");
        }
        System.out.println();
    }

    //Удаление номера
    public void deleteNumber() {
        System.out.println("Введите имя контакта, который хотите изменить:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phoneList = phoneBook.get(name);
            System.out.println("Введите id номера, который хотите удалить из контакта " + name + ":");
            for (int i = 0; i < phoneList.size(); i++) {
                System.out.println("id " + i + ": " + phoneList.get(i));
            }
            Scanner scannerId = new Scanner(System.in);
            int n = scannerId.nextInt();
            System.out.println("Номер " + phoneList.get(n) + " успешно удалён.");
            phoneList.remove(n);
        } else {
            System.out.println("Контакта с именем " + name + " нет в списке контактов");
        }
        System.out.println();
    }

    //Удаление контакта
    public void deleteContact() {
        System.out.println("Введите имя контакта, который хотите удалить:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Контакт с именем " + name + " успешно удалён.");
        } else {
            System.out.println("Контакта с именем " + name + " нет в списке контактов");
        }
        System.out.println();
    }

    //Отображение списка контактов
    public void showPhoneBook() {
        ArrayList<Integer> contactSize = new ArrayList<>();
        ArrayList<String> names = new ArrayList<String>();

        for (String s : phoneBook.keySet()) {
            contactSize.add(phoneBook.get(s).size());
        }
        contactSize.sort(Collections.reverseOrder());

        for (Integer i : contactSize) {
            for (String s : phoneBook.keySet()) {
                if (phoneBook.get(s).size() == i && !names.contains(s)) {
                    names.add(s);
                    System.out.print(s + ":");
                    for (Integer item : phoneBook.get(s)) {
                        System.out.print(" " + item);
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        int phone1;
        int phone2;
        int phone3;
        int phone4;
        int phone5;

        name2 = "Ivanov";
        name1 = "Petrov";
        name3 = "Sidorov";
        name4 = "Testov";
        phone1 = 123456;
        phone2 = 654321;
        phone3 = 335533;
        phone4 = 445544;
        phone5 = 555555;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name2, phone3);
        myPhoneBook.add(name2, phone4);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name4, phone5);
        myPhoneBook.add(name4, phone2);
        myPhoneBook.add(name4, phone3);

        boolean b = true;
        while (b){
            menu();
            Scanner scannerMenu = new Scanner(System.in);
            int menu_list = scannerMenu.nextInt();
            switch (menu_list){
                case 1:
                    System.out.println("Введите имя контакта:");
                    Scanner scannerName = new Scanner(System.in);
                    String name = scannerName.nextLine();
                    System.out.println("Введите номер телефона:");
                    Scanner scannerNumber = new Scanner(System.in);
                    int number = scannerNumber.nextInt();
                    myPhoneBook.add(name, number);
                    break;
                case 2:
                    myPhoneBook.find();
                    break;
                case 3:
                    myPhoneBook.deleteNumber();
                    break;
                case 4:
                    myPhoneBook.deleteContact();
                    break;
                case 5:
                    myPhoneBook.showPhoneBook();
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Выберете пункт меню:\n" +
                "-> 1. Добавить контакт.\n" +
                "-> 2. Поиск.\n" +
                "-> 3. Удалить номер телефон.\n" +
                "-> 4. Удалить контакт.\n" +
                "-> 5. Показать адресную книгу.\n" +
                "-> 0. Выйти из программы.");
    }
}