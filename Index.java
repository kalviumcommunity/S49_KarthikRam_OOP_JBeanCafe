import Coffee;
import java.util.*;

public class Index{
    static public String name;

    public static void main(String[] args){
        Coffee coffee = new Coffee();
        System.out.println("Hello, world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to have ?");
        String user = scanner.nextLine();
        scanner.close();
        System.out.printf("hello", user);
    }
}