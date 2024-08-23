// import java.util.*;

public class Coffee {
    private String name;
    private String size;
    private double basePrice;

    Coffee(String name, String size, double basePrice){
        //this pointer
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    //method
    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
                return basePrice;
            case "medium":
                return basePrice*1.3;
            case "large":
                return basePrice*1.8;
            default:
                return basePrice;
        }
    }

    public String getCoffee(String selSize){
        //this pointer
        this.size = selSize;
        return String.format("Coffee: %s, Size: %s, Price: Rs.%.2f", name, size, calculatePrice());
    }

    //getter() method
    public String getName(){
        return name;
    }

    // public Coffee espresso = new Coffee("espresso", "small", 2.3);
}
