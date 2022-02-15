import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();
        if(name.equals("Alice") || name.equals("Bob")){
            System.out.println("Your name is: " + name);
        } else{
            System.out.println("You are not Alice or Bob.");
        }

    }
}
