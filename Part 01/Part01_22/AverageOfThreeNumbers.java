import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        String s = scanner.nextLine();
        int a = Integer.valueOf(s);
        System.out.println("Give the second number:");
        String st = scanner.nextLine();
        int b = Integer.valueOf(st);
        System.out.println("Give the third number:");
        String ste = scanner.nextLine();
        int c = Integer.valueOf(ste);
        double p = (1.0 * (a + b + c)) / 3;
        
        System.out.println("The average is "+p);

    }
}
