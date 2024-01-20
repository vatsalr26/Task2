package main;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Hedgehog hedgehog = new Hedgehog();
            while (true) {
                System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("What does hedgehog say?");
                        scanner.nextLine(); 
                        String message = scanner.nextLine().trim(); 
                        if (message.isEmpty()) {
                            hedgehog.talk();
                        } else {
                            hedgehog.speak(message);
                        }
                        break;
                    case 2:
                        System.out.println("What is the name of the hedgehog:");
                        scanner.nextLine(); 
                        String name = scanner.nextLine();
                        System.out.println("What is the age of the hedgehog:");
                        int age = scanner.nextInt();
                        hedgehog = new Hedgehog(name, age);
                        break;
                    case 3:
                        hedgehog.run(scanner.nextInt());
                        break;
                    case 0:
                        System.out.println("Thank you for using the program.");
                        System.exit(0);
                    default:
                        System.out.println("Wrong input value");
                }
            }
        }
    }
}
