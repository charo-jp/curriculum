package readability;
import java.util.Scanner;
public class Main {
    public static String hardOrEasy(String input) {
        if (input.length() > 100) {
            return "HARD";
        }
        return "EASY";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = hardOrEasy(input);
        System.out.println(result);
    }

}
