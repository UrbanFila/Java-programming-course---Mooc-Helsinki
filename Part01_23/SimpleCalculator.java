import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        String sa = scanner.nextLine();
        int a = Integer.valueOf(sa);
        System.out.println("Give the second number:");
        String sb = scanner.nextLine();
        int b = Integer.valueOf(sb);

        int sum = a + b;
        System.out.println(a+" + "+b+" = "+sum);
        int minus = a - b;
        System.out.println(a+" - "+b+" = "+minus);
        int mult = a * b;
        System.out.println(a+" * "+b+" = "+mult);
        double div = (1.0 * a)/(1.0 * b);
        System.out.println(a+" / "+b+" = "+div);
    }
}
