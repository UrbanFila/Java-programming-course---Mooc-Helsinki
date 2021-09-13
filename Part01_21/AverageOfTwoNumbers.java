import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        String s = scanner.nextLine();
        int a = Integer.valueOf(s);
        System.out.println("Give the second number:");
        String st = scanner.nextLine();
        int b = Integer.valueOf(st);
        
        double p = (1.0 * (a + b)) / 2;
        
        System.out.println("The average is "+p);
        // Write your program here

    }
}
