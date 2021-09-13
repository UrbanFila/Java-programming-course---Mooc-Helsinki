import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String st = scanner.nextLine();
        int cifra = Integer.valueOf(st);
        
        System.out.println("You gave the number "+cifra);

    }
}
