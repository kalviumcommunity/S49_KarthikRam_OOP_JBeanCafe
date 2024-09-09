public class Menu {
    private Coffee espresso;
    private Coffee latte;
    private Coffee[] additionalCoffees;

    public Menu(){
        this.espresso = new Coffee("espresso", "small", 47);
        this.latte = new Coffee("latte", "small", 198);

        additionalCoffees = new Coffee[]{
            new Coffee("cappuccino", "small", 150),
            new Coffee("americano", "small", 100)
        };
    }

    public Coffee getCoffeeByName(String name) {
        switch (name.toLowerCase()) {
            case "espresso":
                return espresso;
            case "latte":
                return latte;
            default:
                return getCoffeeFromArrayByName(name);
        }
    }

    //Getting coffee from the array using getter() method
    private Coffee getCoffeeFromArrayByName(String name) {
        for (Coffee coffee : additionalCoffees) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }
        return null;
    }

}
