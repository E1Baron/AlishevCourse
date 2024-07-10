package part01.homework.day02;

import java.util.Scanner;

/**
 * @author El Baron 10.07.2024
 * Реализовать программу, которая принимает на вход через консоль с помощью класса
 * Scanner, число x. Для этого числа, по определённой формуле, необходимо вычислить
 * значение y.
 */
public class Task04 {
    public static void main(String[] args) {
        System.out.println("Ведите значение x");
        double y = 0;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x >= 5) {
             y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
             y = (x + 3) * (Math.pow(x,2) - 2);
        } else y = 420;
        System.out.println(y);

    }
}
