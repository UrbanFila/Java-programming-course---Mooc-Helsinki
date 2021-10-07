import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int counter = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            counter++;
            list.add(input);
        }
        
        double a = 0;
        int sum = 0;
        
        for(int i = 0; i < counter; i++){
            sum += list.get(i);
        }
        double ds = sum;
        double cs = counter;
        a = (ds)/(cs);
        
        System.out.println("Average: "+a);
        
        
    }
}
