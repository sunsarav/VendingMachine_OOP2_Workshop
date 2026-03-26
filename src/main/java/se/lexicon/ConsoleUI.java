package se.lexicon;

import java.util.Scanner;

public class ConsoleUI {
    private IVendingMachine machine = new VendingMachineImpl();
    Scanner scanner = new Scanner(System.in);

public void start() {
boolean running = true;
    do {
        System.out.println("---WELCOME TO THE VENDING MACHINE---");
        System.out.println("1. View Products");
        System.out.println("2. Insert Coin values (1, 2, 5, 10, 20 or 50)");
        System.out.println("3. Purchase Product");
        System.out.println("4. Return Money");
        System.out.println("5. Cancel and Exit");
        System.out.println("Please Enter Your Choice: ");

        int choice = scanner.nextInt();


        switch (choice) {
            case 1: // View Products
                for (Product p : machine.getProducts()) {
                    System.out.println(p.getId() + " " + p.getName() + " Price: " + p.getPrice()
                            + " Quantity: " + p.getQuantity());
                }
                break;
            case 2: // Insert Coin
                System.out.println("Insert Coin");
                int coin = scanner.nextInt();
                machine.insertCoin(coin);
                break;
            case 3: // Buy
                System.out.println("Enter Product id: ");
                int id = scanner.nextInt();
                Product p = machine.purchaseProduct(id);
                if (p != null) {
                    System.out.println("Bought: " + p.getName());
                }
                break;
            case 4: // Return Money
                System.out.println("Change: " + machine.returnChange());
                break;
            case 5: // Exit
                running = false;
                System.out.println("GoodBye!");
                break;
        }
    } while (running);

}
}
