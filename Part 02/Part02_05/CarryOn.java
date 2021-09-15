
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        loop: while(true){
            System.out.println("Shall we carry on?");
            
            String word = scanner.nextLine();
            System.out.println(word);
            
            if(word.equals("no")){
                break loop;
            }
        
        }

    }
}
