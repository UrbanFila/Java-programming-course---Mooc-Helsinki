public class StarSign {

    public static void main(String[] args) {
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
