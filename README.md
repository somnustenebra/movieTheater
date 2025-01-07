/*

==========================================================



             PROJECT: movieTheater                     

==========================================================



Description:



This Java application simulates a virtual movie theater experience.

Users can deposit money into a movie theater card, purchase movie

tickets, and order food or drinks from a categorized menu.

The project follows Object-Oriented Programming (OOP)

principles and uses interfaces with multiple classes.





Key Functionalities:





Deposit money in increments of $5, $10, $25, $50, or $100.



Select seats and purchase movie tickets (prints ticket).



Purchase items from categories (combos, appetizers, etc.).



Logging system tracks all deposits and purchases.



Prompts users for deposits when balance is insufficient.



Main menu displays current balance with options.





Project Structure:







Interfaces:



CinemaCardOperations : Manages deposits/balance inquiries.



TicketOperations     : Handles seat selection/ticketing.



PurchaseOperations   : Manages purchases and menus.





Classes:



movieTheaterCard           : Implements movieTheaterCardOperations.



TicketSystem         : Implements TicketOperations.



ItemPurchaseSystem   : Implements PurchaseOperations.



virtualMovieTheaterApp     : Integrates all systems.





Code Highlights:





Modular design using interfaces and classes.



Comprehensive logging for transaction tracking.



Intuitive menu-driven interface.







Instructions to Run:





Compile all Java files.



Run the VirtualCinemaApp class.



Follow prompts to deposit money, buy tickets, or order items.



Current balance displays after each transaction.





Example Output:



Welcome to the Virtual Cinema!
Cinema Card Balance : $ 0
1. Deposit Money
2. Buy Tickets
3. Purchase Items
4. Exit
Select an option: 1
Deposit in increments of 5, 10, 25, 50, or 100.
Enter deposit amount: 25
Deposit successful. Current balance: $25





Logging:



All transactions (deposits, ticket purchases, item purchases)

are logged for administrative purposes.





Future Enhancements:





Dynamic peak-hour pricing.



Refund and cancellation features.



Discounts and Promotions.

==========================================================
*/

