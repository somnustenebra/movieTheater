package src.main.java;

import java.util.*;
import java.util.logging.Logger;

public class TicketSystem implements TicketOperations{
    private static final boolean[] seats = new boolean[30];
    private static final int TICKET_PRICE = 12;
    private final MovieTheaterCard movieTheaterCard;
    private static final Logger logger = Logger.getLogger(TicketSystem.class.getName());

    static {
        Arrays.fill(seats, true);
    }

    public TicketSystem(MovieTheaterCard movieTheaterCard) {
        this.movieTheaterCard = movieTheaterCard;
    }

    @Override
    public void selectSeat(Scanner scanner) {
        List<Integer> availableSeats = getAvailableSeats();
        displayAvailableSeats(availableSeats);
        processSeatSelection(scanner, availableSeats);
    }

    private List<Integer> getAvailableSeats() {
        List<Integer> availableSeats = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                availableSeats.add(i + 1);
            }
        }
        return availableSeats;
    }

    private void displayAvailableSeats(List<Integer> availableSeats) {
        System.out.println("Available seats: " + availableSeats);
        if (availableSeats.isEmpty()) {
            System.out.println("No available seats.");
        }
    }

    private void processSeatSelection(Scanner scanner, List<Integer> availableSeats) {
        if (!availableSeats.isEmpty()) {
            System.out.print("Select a seat number: ");
            int seatChoice = scanner.nextInt();
            scanner.nextLine();
            if (availableSeats.contains(seatChoice)) {
                handleTicketPurchase(seatChoice, scanner);
            } else {
                System.out.println("Invalid seat selection.");
            }
        }
    }

    private void handleTicketPurchase(int seatChoice, Scanner scanner) {
        if (movieTheaterCard.getBalance() >= TICKET_PRICE) {
            seats[seatChoice - 1] = false;
            movieTheaterCard.deductBalance(TICKET_PRICE);
            logger.info("Ticket purchased for seat " + seatChoice + ". Remaining balance: $" + movieTheaterCard.getBalance());
            printTicket(seatChoice);
        } else {
            System.out.println("There seems to not be enough balance in your card.");
            System.out.println("Please deposit some money and try again :)");
            movieTheaterCard.depositMoney(scanner);
        }
    }

    @Override
    public void printTicket(int seatNumber) {
        String[] movies = {"Blockbuster Movie", "Epic Adventure", "Romantic Comedy", "Horror Night", "Sci-Fi Extravaganza"};
        String[] auditoriums = {"Auditorium 1", "Auditorium 2", "Auditorium 3", "Auditorium 4", "Auditorium 5"};
        String[] times = {"5:00 PM", "6:30 PM", "7:00 PM", "8:45 PM", "10:00 PM"};

        Random random = new Random();
        String movie = movies[random.nextInt(movies.length)];
        String auditorium = auditoriums[random.nextInt(auditoriums.length)];
        String time = times[random.nextInt(times.length)];

        System.out.println("\n--- Ticket ---");
        System.out.println("Movie: " + movie);
        System.out.println("Auditorium: " + auditorium);
        System.out.println("Time: " + time);
        System.out.println("Seat: " + seatNumber);
        System.out.println("---------------\n");
    }
}

