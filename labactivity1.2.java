import java.util.Scanner;

public class abuhan {
    public static boolean capital(String message) {
        String[] words = message.split("\\s+");
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();
        
        if (capital(message)) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
}
