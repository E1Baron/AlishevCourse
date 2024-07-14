package part01.homework.day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author El Baron 14.07.2024
 * Урок 11: Массивы в Java.
 * Урок 12: Цикл for each, Массивы строк.
 * Урок 13: Многомерные массивы.
 * Ответы на вопросы 2: Генерация случайных чисел. Класс Random
 * Дополнительные статьи:
 * Многомерный массив, способы создания
 * https://vertex-academy.com/tutorials/ru/dvumernye-massivy-v-java/
 * или
 * http://developer.alexanderklimov.ru/android/java/array.php#multi
 * Более развернуто о генерации чисел
 * https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
 * *Обратите в статье особое внимание на способ создания пустого двумерного массива
 * (int [][] x = new int [n][m])
 * Дополнительная информация:
 * Для того, чтобы вывести массив на экран, можно вручную перебрать все его элементы
 * с помощью цикла, но удобнее использовать метод Arrays.toString(). Этот метод
 * описан здесь: https://www.examclouds.com/ru/java/java-core-russian/arrays-tostring
 * Оба варианта вывода массива на экран (вручную и с помощью Arrays.toString())
 * - правильные. Используйте любой из них.
 * ЗАДАЧА
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
public class Task01 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int massSize = sc.nextInt();
        int[] massive = new int[massSize];
        for (int i = 0; i < massive.length;i++){
            massive[i] = rand.nextInt(1,11);
        }
        int eightCounter = 0;
        int oneCounter = 0;
        int chet = 0;
        int neChet = 0;
        int allArrayNumbersSum = 0;
        for (int i = 0; i < massive.length;i++){
            allArrayNumbersSum = allArrayNumbersSum + massive[i];
            if (massive[i] > 8){
                eightCounter++;
            }
            if (massive[i] == 1){
                oneCounter++;
            }
            if(massive[i] % 2 == 0){
                chet++;
            }
            if (massive[i] % 2 != 0){
                neChet++;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("Длинна массива: " + massive.length);
        System.out.println("Количество чисел больше 8: " + eightCounter);
        System.out.println("Количество чисел равных 1: " + oneCounter);
        System.out.println("Количество чётных чисел: " + chet);
        System.out.println("Количество нечётных чисел: " + neChet);
        System.out.println("Сумма всех элементов массива: " + allArrayNumbersSum);
    }
}
