import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            counter++;
            list.add(input);
        }
        
        int current = list.get(0);
        int min = current;
        int index = 0;
        
        for(int i = 0; i < counter; i++){
            
            current = list.get(i);
            
            if(current < min){
                min = current;
                index = i;
            }
        }
        
        System.out.println("Smallest number: "+min);
        System.out.println("Found at index: "+index);
        

        
    }
}
