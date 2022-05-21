package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        int capacity = 10;
        int size = 0;
        String[] toDoList = new String[capacity];
        int choose = 3;

        do {
            System.out.println("1. Add item\n2. Show all\n3. Exit");
            choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println("Enter new toDo");
                scanner.nextLine();

                while (size >= capacity) {
                    toDoList = growArray(toDoList);
                    capacity = toDoList.length;
                }

                toDoList[size++] = scanner.nextLine();

            } else if (choose == 2) {
                System.out.println(Arrays.toString(toDoList));
            }
        }
        while (choose != 3);
    }

    public static String[] growArray(String[] originalArray) {
        return Arrays.copyOf(originalArray, originalArray.length * 2);
    }
}
