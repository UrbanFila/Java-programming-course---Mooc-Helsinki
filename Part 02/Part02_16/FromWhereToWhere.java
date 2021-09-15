
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int num = scanner.nextInt();
        System.out.println("Where from?");
        int num2 = scanner.nextInt();
        
        for(int i = num2; i <= num; i++){
            System.out.println(i);
        }
    }
}
