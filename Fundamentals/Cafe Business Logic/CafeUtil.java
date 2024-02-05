import java.util.ArrayList;

public class CafeUtil {

    public static int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public static void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public static void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double totalPrice = price * i;
            System.out.println(i + " - $" + String.format("%.2f", totalPrice));
        }
    }

    public static boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- $" + String.format("%.2f", prices.get(i)));
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the methods
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Coffee");
        menuItems.add("Tea");
        menuItems.add("Cake");

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(2.5);
        prices.add(1.8);
        prices.add(3.5);

        // Display the menu with prices
        displayMenu(menuItems, prices);
    }
}
