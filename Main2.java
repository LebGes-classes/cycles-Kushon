
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int longestposled= 0;
        int maxlong = 1;
        for (int i = 0; i < n; i++) {
            int tekposled = 1;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > matrix[i][j - 1]) {
                    tekposled++;
                } else {
                    if (tekposled > maxlong) {
                        longestposled = i;
                        maxlong = tekposled;
                    }
                    tekposled = 1;
                }
            }
            if (tekposled > maxlong) {
                longestposled = i;
                maxlong = tekposled;
            }
        }

        System.out.println("№ строки с самой длинной возрастающей последовательностью: " + longestposled);


        for (int i = 0; i < n; i++) {
            int t = matrix[i][0];
            matrix[i][0] = matrix[i][1];
            matrix[i][1] = t;
        }

        System.out.println("матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}