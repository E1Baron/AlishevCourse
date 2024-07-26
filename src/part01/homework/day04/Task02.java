package part01.homework.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @author El Baron 14.07.2024
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено
 */
public class Task02 {
    public static void main(String[] args) {


        Random rand = new Random();
        int[] massive = new int[100];
        for (int i = 0; i < massive.length; i++)
            massive[i] = rand.nextInt(10000);
        int max = Integer.MIN_VALUE;
        for (int element : massive) {
            if (element > max)
                max = element;
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Наибольший элемент массива: " + max);

        int min = Integer.MAX_VALUE;
        for (int element : massive) {
            if (element < min)
                min = element;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int massZeroEndsCounter = 0;
        int massElementsSumCounter = 0;
        for (int element : massive) {
            if (element % 10 == 0) {
                massZeroEndsCounter++;
                massElementsSumCounter = massElementsSumCounter + element;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + massZeroEndsCounter);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + massElementsSumCounter);
    }
}



