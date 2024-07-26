package part01.homework.day04;

import java.util.Arrays;
import java.util.Random;

/**
 * @author El Baron 17.07.2024
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 * Пример сгенерированной матрицы (для простоты m=3, n=5):
 * 3 2 1 5 7 // сумма - 18
 * 1 2 5 6 2 // сумма - 16
 * 3 4 9 6 4 // сумма - 26
 * Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */
public class Task03 {
    public static void main(String[] args) {

        int maxsum = 0;
        int maxSumIndx = 0;
        Random rand = new Random();
        int[][] massive = new int[12][8];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < massive.length; i++) {
            int sum = 0;
            for (int j = 0; j < massive[i].length; j++) {
                sum = sum + massive[i][j];
            }
            if (sum >= maxsum) {
                maxsum = sum;
                maxSumIndx = i;
            }
        }
        System.out.println(maxSumIndx);
        /*
         Для большего понимания и проверки вывел сам массив - дважды
         */
        for (int[] a : massive) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.deepToString(massive));


    }
}
