package part01.homework.day01;

/**
 * @author El Baron 02.07.2024
 * Доп. статьи первого дня
 * Прочитать о другом способе вывода информации в консоль
 * https://metanit.com/java/tutorial/2.9.php
 *
 * Вывести на экран слово “JAVA” , в строку, чтобы оно повторилось 10 раз, используя
 * цикл while .
 * Вывод в консоль должен быть таким:
 * JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class Task01 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.print("JAVA ");
            i--;
        }
    }
}
