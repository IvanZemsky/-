package org.example;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.concurrent.ThreadLocalRandom;

public class Main1 {
    public static void main(String[] args) {

        final int SIZE = 10;

        final double LOWER_BOUND = -10.0;

        final double UPPER_BOUND = 10.0;

        long startTime = System.nanoTime();

        double[] array = ThreadLocalRandom.current().doubles(SIZE, LOWER_BOUND, UPPER_BOUND).toArray();


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

        long duration = (endTime - startTime) / 1_000_000; // в мс
        System.out.println("Время выполнения:" + duration + " мс.");

        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();

        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("\nМинимальный оперативная память: " + usedMemory + " байт");

        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        MemoryUsage heapMemoryUsage =memoryBean.getHeapMemoryUsage();

        usedMemory = heapMemoryUsage.getUsed();
        
        System.out.println("Используемая внутренняя память: " + usedMemory + " байт");
    }
}