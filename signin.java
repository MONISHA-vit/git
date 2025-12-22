import java.util.Scanner;

public class SignIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stored credentials (example)
        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\n✅ Login Successful!");
                System.out.println("Welcome, " + username);
                break;
            } else {
                attempts--;
                System.out.println("\n❌ Invalid credentials.");
                System.out.println("Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("\n🔒 Account locked. Try again later.");
            }
        }

        sc.close();
    }
}

