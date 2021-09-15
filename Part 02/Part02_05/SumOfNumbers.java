import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        loop: while(true){
            System.out.println("Give a number:");
            
            int num = scanner.nextInt();
            System.out.println(num);
            
            if(num != 0){
                sum = sum + num;
            } else if (num == 0){
                break loop;
            }
        }
        System.out.println("Sum of the numbers: "+sum);

    }
}
