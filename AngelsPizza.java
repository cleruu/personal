// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        String crust = "";
        double price = 0;
        String size = "";

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                //price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                //price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Please select the type of crust for: " + pizza);
        System.out.println("Enter A if you want Hand Tossed");
        System.out.println("Enter B if you want Thin Crust");

        System.out.print("Enter your choice here: ");
        char crustChoice = scan.next().charAt(0);

        switch (crustChoice) {
            case 'A':
                crust = "Hand Tossed";
                break;
            case 'B':
                crust = "Thin Crust";
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.println("Please select the size of the pizza: " + pizza);
        System.out.println("Enter A if you want Medium");
        System.out.println("Enter B if you want Family");
        System.out.println("Enter C if you want Big Family");

        System.out.print("Enter your choice here: ");
        char sizeChoice = scan.next().charAt(0);


        switch (sizeChoice) {
            case 'A':
                size = "Medium";
                price = 355;
                break;
            case 'B':
                size = "Family";
                price = 505;
                break;
            case 'C':
                size = "Big Family";
                price = 610;
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }


        System.out.print("Enter the quantity of pizza you want: ");
        int quantity = scan.nextInt();


        System.out.println("Your order is: " + size + ", " + crust + ", " + pizza);
        System.out.println("Your total amount is: " + (price * quantity));


        scan.close();
    }
}
