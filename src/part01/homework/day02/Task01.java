package part01.homework.day02;

import java.util.Scanner;

/**
 * @author El Baron 07.07.2024
 * Дополнительные статьи:
 * 1. Статья про арифметические операторы в Java. Они необходимы для решения задач
 * этого и последующих дней.
 * http://study-java.ru/uroki-java/arifmeticheskie-operatory-i-matematika-v-java/
 *
 * Реализовать программу, которая принимает на вход через консоль с помощью
 * класса Scanner, число, соответствующее количеству этажей в здании. Используя
 * условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
 * - “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
 * отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введите цифрами количество этажей в доме и нажмите ENTER");
        Scanner sc = new Scanner(System.in);
        int floorCounter = sc.nextInt();
        if (floorCounter >= 1 && floorCounter <= 4) {
            System.out.println("Это малоэтажный дом");
        } else if (floorCounter >= 5 && floorCounter <= 8) {
            System.out.println("Дом средней этажности");
        } else if (floorCounter >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
