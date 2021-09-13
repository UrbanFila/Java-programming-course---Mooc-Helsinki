import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String c0 = scan.nextLine();
        
        System.out.println("Give an integer:");
        String st = scan.nextLine();
        int c1 = Integer.valueOf(st);
     
        
        System.out.println("Give a double:");
         st = scan.nextLine();
         double c2 = Double.valueOf(st);
       
        // Write your program here
        System.out.println("Give a boolean:");
        boolean c3 = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string "+c0);
        System.out.println("You gave the integer "+c1);
        System.out.println("You gave the double "+c2);
        System.out.println("You gave the boolean "+c3);
    }
}
