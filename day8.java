import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class day8 {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Login System =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> register();
                case 2 -> login();
                case 3 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    static void register() {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }

    static void login() {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                System.out.println("Login successful! Welcome " + username);
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }
}
