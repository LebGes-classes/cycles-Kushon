
public class Main3 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i % 3 == 0) {
                int sumZifr = 0;
                int num = i;
                while (num > 0) {
                    sumZifr += num % 10;
                    num /= 10;
                }

                int k = i / 3;
                int sumK = 0;
                while (k > 0) {
                    sumK += k % 10;
                    k /= 10;
                }

                if (sumZifr > sumK) {
                    System.out.println(i);
                }
            }
        }
    }
}