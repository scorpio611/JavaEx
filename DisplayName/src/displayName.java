import java.util.Scanner;

public class displayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s",name);
    }
}
