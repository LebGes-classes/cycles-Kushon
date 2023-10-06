import java.util.*;

public class dz {
    public static String obr_slova(String input) {
    String[] words = input.split(" ");
    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
        reversed.append(words[i]);
        if (i != 0) {
            reversed.append(" ");
        }
    }

    return reversed.toString();
}

    public static String obr_stroka(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String obr = obr_slova(input);
        String obr_str = obr_stroka(obr);

        System.out.println("Обратная строка:");
        System.out.println(obr_str);
    }

}