import java.util.*;

public class Index{
    // static public String name;
    public static String name;

    public static void main(String[] args){
        
        //Objects
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.printf("Hello, Welcome to Jbean cafe, how may I assist you?" + "\n" + "Please enter 1 for getting overall menu info" + "\n" + "Enter 2 to place an order." + "\n");

        int display = scanner.nextInt();
        scanner.nextLine();

        if(display == 1){
            System.out.printf("The total number of coffee available is: " + Coffee.getTotalCoffeeCount() + "\n");
            System.out.printf("The total base price of coffee's available is: " + Coffee.getCoffeeRevenue() +"\n(This is only provided if you want to order the whole menu)");
        }else if(display == 2){
            System.out.println("What coffee would you like to have? (espresso, latte, cappuccino, americano)");
            String coffeeChoice = scanner.nextLine().toLowerCase();
    
            Coffee selectedCoffee = menu.getCoffeeByName(coffeeChoice);
            if (selectedCoffee == null) {
                System.out.println("Oh Oh!, The seems not to be available");
                System.out.println("Please check menu for the coffees that are available");
            } else {
                System.out.println("what would be your preferred size for the coffee " + selectedCoffee.getName() + " ? (small, medium, large)");
            }
            String selectedSize = scanner.nextLine().toLowerCase();
    
            if (selectedCoffee != null) {
                System.out.println("Re-confirm your order, " + selectedCoffee.getCoffee(selectedSize));
            } else {
                System.out.println("Sorry, we don't have that coffee.");
            }
        }


        scanner.close();
    }
}