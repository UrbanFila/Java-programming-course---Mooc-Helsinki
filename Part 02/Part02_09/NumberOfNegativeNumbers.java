
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        
        loop: while(true){
            System.out.println("Give a number:");
            
            int num = scanner.nextInt();
            System.out.println(num);
            
            if(num < 0){
                counter++;
            } else if (num == 0){
                break loop;
            }
        }
        System.out.println("Number of negative numbers: "+counter);

    }
}
