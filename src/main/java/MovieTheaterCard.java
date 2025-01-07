package src.main.java;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class MovieTheaterCard implements MovieTheaterCardOperations {
    private int balance = 0;
    private static final Logger logger = Logger.getLogger(MovieTheaterCard.class.getName());

    @Override
    public void depositMoney(Scanner scanner) {
        System.out.println("Deposit in increments of 5, 10, 25, 50, or 100.");
        System.out.print("Enter deposit amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        if (List.of(5, 10, 25, 50, 100).contains(amount)) {
            balance += amount;
            logger.info("Deposited: $" + amount + ". Current balance: $" + balance);
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please deposit in allowed increments.");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        balance -= amount;
    }
}
