// import java.util.*;

public class Coffee {
    private String name;
    private String size;
    private double basePrice;

    Coffee(String name, String size, double basePrice){
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
                return basePrice;
            case "medium":
                return basePrice*0.8;
            case "large":
                return basePrice*1.2;
            default:
                return basePrice;
        }
    }

    public String getCoffee(){
        return String.format("Coffee: %s, Size: %s, Price: $%.2f", name, size, calculatePrice());
    }
}
