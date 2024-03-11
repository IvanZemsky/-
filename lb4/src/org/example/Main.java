package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) throw new Exception();
            System.out.println("Вы ввели правильную строку");
        }
        catch (Exception ex) {
            System.out.println("Вводить пустую строку нельзя!");
        }
        finally {
            System.out.println("Программа закончила свое выполнение");
        }
    }
}