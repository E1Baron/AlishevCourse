package addons;

/**
 * @author El Baron 07.07.2024
 * Пример вычисления факториала числа 6, где n это число факториал
 * которого мы хотим вычислить
 */
public class Add02 {
    public static void main(String[] args) {
        int n = 6;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result  = result * i;
        }
        System.out.print(result);
    }
}
