package part01.homework.day01;

/**
 * @author El Baron 02.07.2024
 * Объявите переменную типа int, имя переменной - k. Присвойте этой переменной
 * какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
 * выведите в консоль таблицу умножения для этой цифры в следующем формате:
 * 1 x k = …
 * 2 x k = …
 * 3 x k = …
 * ……
 * 9 x k = …
 * Пример:
 * k = 3
 * Вывод в консоль:
 * 1 x 3 = 3
 * 2 x 3 = 6
 */
public class Task06 {
    public static void main(String[] args) {
        int k = 7;
        int j = 1;
        while (j <= 9) {
            System.out.println(j + " x " + k + " = " + k * j);
            j++;

        }

    }
}
