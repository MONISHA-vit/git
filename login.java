import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined username and password
        String savedUsername = "user";
        String savedPassword = "pass123";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("\n✅ Login Successful!");
            System.out.println("Welcome " + username);
        } else {
            System.out.println("\n❌ Login Failed!");
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}

