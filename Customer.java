public class Customer extends Person {
    private int loyaltyPoints;

    public Customer(String firstName, String lastName, String email, String phoneNumber, int loyaltyPoints) {
        super(firstName, lastName, email, phoneNumber);
        this.loyaltyPoints = loyaltyPoints;
    }

    // Overriding the abstract method from the Person parent class.
    @Override
    public String getType() {
        return "Customer";
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loyalty Points: " + loyaltyPoints);
    }
}
