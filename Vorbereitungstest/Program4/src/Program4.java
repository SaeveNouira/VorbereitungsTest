import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        int sum = 0;
        int number;
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        while(number != 0){
            sum += number;
            number--;
        }
        System.out.println(sum);
    }
}
