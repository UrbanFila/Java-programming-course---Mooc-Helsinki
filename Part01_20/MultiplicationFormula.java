import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your p
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int vsota = first * second;
        System.out.println(first+" * "+second+" = "+vsota);
        
        
        int dividend = 3;
int divisor = 2;

double result = dividend / divisor * 1.0;
System.out.println(result);

    }
}
