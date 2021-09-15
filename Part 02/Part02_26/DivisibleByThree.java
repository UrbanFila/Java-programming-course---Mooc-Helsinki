import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        divisibleByThreeInRange(num1, num2);

    }
    
    public static void divisibleByThreeInRange(int beginning, int end){
        int counter = 0;
        
        for(int i = beginning; i<= end; i++){
            if( i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
