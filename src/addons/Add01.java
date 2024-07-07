package addons;

import java.util.Scanner;

/**
 * @author El Baron 04.07.2024
 * Нечто вроде блокнота с подсказками синтаксиса и конструкций
 * Внимание, для ввода значения типа float
 * (то же самое относится к типу double) применяется число "1,7",
 * где разделителем является запятая, а не "1.7", где разделителем является точка.
 * В данном случае все зависит от текущей языковой локализации системы.
 * В моем случае русскоязычная локализация, соответственно вводить необходимо числа,
 * где разделителем является запятая.
 */
public class Add01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input age: ");
        int age = sc.nextInt();
        System.out.println("Input height: ");
        float height = sc.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

    }
}
