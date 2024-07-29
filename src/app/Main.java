package app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Все числа: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сумма отрицательных чисел:" + negativeSum);

        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);

        int maxElement = array[0];
        int minElement = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        System.out.println("Самый большой элемент: " + maxElement + " (Индекс " + maxIndex + ")");
        System.out.println("Самый маленький элемент: " + minElement + " (Индекс " + minIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("В массиве нет отрицательных чисел.");
        } else {
            int sumAfterFirstNegative = 0;
            int countAfterFirstNegative = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterFirstNegative += array[i];
                countAfterFirstNegative++;
            }
            double averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.println("Среднее арифметическое чисел после первого отрицательного числа: " + averageAfterFirstNegative);
        }
    }
}
