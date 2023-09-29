import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод размера массива:");
        int n = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("Ввод элементов массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        int zero_count = 0;
        for (double i : array) {
            if (i == 0) {
                zero_count++;
            }
        }
        System.out.println("Кол-во элементов, равных нулю:" + zero_count);

        double otr_nech = 0;
        for (double i : array) {
            if (i < 0 && i % 2 != 0) {
                otr_nech += i;
            }
        }
        System.out.println("Сумма отрицательных нечетных элементов массива:" + otr_nech);

        System.out.println("Массив:");
        for (double i : array) {
            System.out.print(i + " ");
        }
    }
}
