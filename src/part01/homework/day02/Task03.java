package part01.homework.day02;

import java.util.Scanner;

/**
 * @author El Baron 07.07.2024
 * Реализовать задачу №2, используя цикл while .
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите два числа разделённых пробелом и нажмите ENTER");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (count < b) {
            count++;
            if (count % 5 == 0 && count % 10 != 0) {
                System.out.print(count + " ");
            }
        }
    }
}

