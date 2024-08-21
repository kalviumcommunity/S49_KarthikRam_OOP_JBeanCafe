public class Menu {
    private Coffee espresso;
    private Coffee latte;

    public Menu(){
        this.espresso = new Coffee("espresso", "small", 47);
        this.latte = new Coffee("latte", "small", 198);
    }

    public Coffee getCoffeeByName(String name) {
        switch (name.toLowerCase()) {
            case "espresso":
                return espresso;
            case "latte":
                return latte;
            default:
                return null;
        }
    }
}
