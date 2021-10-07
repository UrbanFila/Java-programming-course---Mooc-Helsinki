
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
        
        System.out.println("");

        // implement finding the greatest number in the list here
        
        int current = list.get(0);
        int max = current;
        
        for(int i = 0; i <= counter - 1; i++){
           
            current = list.get(i);
            
            if(current > max){
                max = current;
            }
        }
        
        System.out.println("The greatest number:"+max);
    }
}
