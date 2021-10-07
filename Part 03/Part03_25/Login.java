import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1 = "alex";
        String password1 = "sunshine";
        String user2 = "emma";
        String password2 = "haskell";
        
        System.out.println("Enter username: ");
        String enter = scanner.nextLine();
        
        if(enter.equals(user1)){
            String pass = scanner.nextLine();
            if(pass.equals(password1)){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        }
        else if(enter.equals(user2)){
         String pass = scanner.nextLine();
            if(pass.equals(password2)){
                System.out.println("You have successfully logged in!");
            } else{
                System.out.println("Incorrect username or password!");
            }
        }
        else{
             System.out.println("Incorrect username or password!");
        }
    }
}
