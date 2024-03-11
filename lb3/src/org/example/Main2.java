package org.example;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        double[] array = new double[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 20 - 10;


            double minPositiveElement = Double.MAX_VALUE;

            boolean foundPositive = false;

            for (double element : array) {
                if (element > 0 && element < minPositiveElement) {
                    minPositiveElement = element;
                    foundPositive = true;
                }
            }

            if (foundPositive) {
                System.out.println("Сгенерированный массив:");

                for (double element : array) {
                    System.out.print(element + " ");
                }

                System.out.println("\nМинимальный положительный элемент: " + minPositiveElement);
            } else {
                System.out.println("Минимальный положительный элемент не найден в сгенерированном массиве.");
            }

            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1_000_000;

            System.out.println("Время выполнения:" + duration + " мс.");

            Runtime runtime = Runtime.getRuntime();

            long totalMemory = runtime.totalMemory();
            long freeMemory = runtime.freeMemory();

            long usedMemory = totalMemory - freeMemory;
            System.out.println("\nМинимальный оперативная память: " + usedMemory + " байт");

            MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            MemoryUsage heapMemoryUsage = memoryBean.getHeapMemoryUsage();

            usedMemory = heapMemoryUsage.getUsed();
            System.out.println("Используемая внутренняя память: " + usedMemory + " байт");
        }
    }
}