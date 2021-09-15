import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        
        loop: while(true){
            
            System.out.println("Give a number: ");
            
            int num = scanner.nextInt();
            
            if(num == 0){
                break loop;
            } else{
                counter++;
                sum += num;
            }
        }
        
        double average = (sum * 1.0/counter);
        System.out.println("Average of the numbers: "+average);
    }
}
