import java.util.Scanner;

public class J032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; --i) {
            reversed += input.charAt(i);
        }

        System.out.println(reversed);

        scanner.close();
    }
}
