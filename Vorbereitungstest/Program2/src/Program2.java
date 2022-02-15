import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        String name = "";
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
