import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

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

        // toteuta listan lukujen summan laskeminen t
        int sum = 0;
        for(int i = 0; i < counter; i++){
            sum += list.get(i);
        }
        System.out.println("Sum: "+sum);
    }
}
