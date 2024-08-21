import java.util.*;

public class Index{
    static public String name;

    public static void main(String[] args){
        
        //Objects
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("What coffee would you like to have?");
        String coffeeChoice = scanner.nextLine().toLowerCase();

        Coffee selectedCoffee = menu.getCoffeeByName(coffeeChoice);
        System.out.println("what would be your preferred size for the coffee" + selectedCoffee + " ? (small, medium, large)");
        String selectedSize = scanner.nextLine().toLowerCase();

        if (selectedCoffee != null) {
            System.out.println("Re-confirm your order, " + selectedCoffee.getCoffee(selectedSize));
        } else {
            System.out.println("Sorry, we don't have that coffee.");
        }

        scanner.close();
    }
}