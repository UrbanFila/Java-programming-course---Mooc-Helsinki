import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int sum =(int)Math.sqrt(num1 + num2);
        
        System.out.println(sum);

    }
}
