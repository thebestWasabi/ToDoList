package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        DynamicArray toDoList = new DynamicArray();
        int choose = 3;

        do {
            System.out.println("Выбери пункт 1, 2 или 3:\n1. Add new item\n2. Show all item\n3. Exit");
            choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println("Enter new toDo");
                scanner.nextLine();
                toDoList.add(scanner.nextLine());
            } else if (choose == 2) {
                System.out.println(toDoList);
            }
        }
        while (choose != 3);
    }
}
