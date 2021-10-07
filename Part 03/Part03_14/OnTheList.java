import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            counter++;
            list.add(input);
        }
        
        System.out.println("Search for?");
        String name = scanner.nextLine();
        int found = 0;
        for(int i = 0; i < counter; i++){
            if(name.equals(list.get(i))){
                System.out.println(name+" was found!");
                found = 1;
                break;
            }
        }
        
        if(found == 0){
            System.out.println(name+"was not found!");
        }
        

    }
}
