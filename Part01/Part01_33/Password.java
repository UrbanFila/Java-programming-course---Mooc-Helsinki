import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Password?");
        String sth = scan.nextLine();
        String sth2 = "Caput Draconis";
        
        if(sth.equals(sth2)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }

        // Write your program here 
    }
}
