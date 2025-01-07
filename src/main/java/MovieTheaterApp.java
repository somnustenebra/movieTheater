package src.main.java;

import java.util.Scanner;

public class MovieTheaterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTheaterCard movieTheaterCard = new MovieTheaterCard();
        TicketSystem ticketSystem = new TicketSystem(movieTheaterCard);
        ItemPurchaseSystem itemSystem = new ItemPurchaseSystem(movieTheaterCard);

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Virtual Movie Theater!");
            System.out.println("Movie Theater Card Balance : $ " + movieTheaterCard.getBalance());
            System.out.println("\t1. Deposit Money");
            System.out.println("\t2. Buy Tickets");
            System.out.println("\t3. Purchase Items");
            System.out.println("\t4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> movieTheaterCard.depositMoney(scanner);
                case 2 -> ticketSystem.selectSeat(scanner);
                case 3 -> itemSystem.purchaseItems(scanner);
                case 4 -> {
                    running = false;
                    System.out.println("Enjoy Your Movie!");
                }
                default -> {
                    System.out.println("Invalid option.");
                    System.out.println("Please choose one of the options above:)");
                    try {
                        // Pause for 2 seconds (2000 milliseconds)
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // Handle the InterruptedException (if the thread is interrupted)
                        System.out.println("Something went wrong");
                    }
                }
            }
        }
        scanner.close();  // Close scanner after loop
    }
}
