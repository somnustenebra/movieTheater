package src.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class ItemPurchaseSystem implements PurchaseOperations {
    private static final Map<String, Map<String, Integer>> menu = new HashMap<>();
    private final MovieTheaterCard movieTheaterCard;
    private static final Logger logger = Logger.getLogger(ItemPurchaseSystem.class.getName());

    static {
        setupMenu();
    }

    public ItemPurchaseSystem(MovieTheaterCard movieTheaterCard) {
        this.movieTheaterCard = movieTheaterCard;
    }

    private static void setupMenu() {
        // Start menu setup
        menu.put("predetermined combos", Map.of("Combo 1", 15, "Combo 2", 18, "Combo 3", 20, "Combo 4", 22, "Combo 5", 25));
        menu.put("appetizers", Map.of("Nachos", 8, "Popcorn", 6, "Mozzarella Sticks", 9, "Onion Rings", 7, "Chicken Wings", 11));
        menu.put("entrees", Map.of("Burger", 12, "Hot Dog", 10, "Chicken Sandwich", 11, "Pizza Slice", 9, "Salad", 10));
        menu.put("drinks", Map.of("Coke", 4, "Pepsi", 4, "Lemonade", 5, "Water", 3, "Iced Tea", 4));
        menu.put("sweets", Map.of("Chocolate Cake", 7, "Ice Cream", 5, "Brownie", 6, "Candy", 4, "Cookies", 5));
        menu.put("wine", Map.of(
                "Red Wine - MacMurray Pinot Noir", 10,
                "Red Wine - Cedar & Salmon Cabernet", 12,
                "Red Wine - Robert Hall Cabernet", 11,
                "Red Wine - Querceto Tuscan Red", 9,
                "Red Wine - Charles & Charles Red Blend", 10
        ));
    }


    @Override
    public void purchaseItems(Scanner scanner) {
        displayMenu();
        String category = getCategory(scanner);
        // Additional logic for item selection and purchase can go here
    }

    // Implement the missing method
    @Override
    public void displayMenu() {
        System.out.println("\n--- Available Menu ---");
        for (String category : menu.keySet()) {
            System.out.println(category + ": " + menu.get(category).keySet());
        }
        System.out.println("----------------------");
    }

    // Helper method to get category
    private String getCategory(Scanner scanner) {
        System.out.print("Enter category: ");
        return scanner.nextLine().toLowerCase();
    }
}
