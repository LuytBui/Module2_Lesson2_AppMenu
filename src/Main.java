import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1: drawTriangle();
                    break;
                case 2: drawSquare();
                    break;
                case 3: drawRectangle();
                    break;
                case 0: break;
                default:
                    alertInvalidInput();
            }
        } while (choice != 0);
        exit();
    } // end of main method
    public static void alertInvalidInput(){
        System.out.println("Please enter one of the numbers below!");
    }
    public static void exit(){
        System.out.println("Exiting...\nGoodbye.");
    }

    public static void drawTriangle(){
        System.out.println("Draw the triangle");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
    public static void drawSquare(){
        System.out.println("Draw the square");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
    }
    public static void drawRectangle(){
        System.out.println("Draw the rectangle");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
    }

}
