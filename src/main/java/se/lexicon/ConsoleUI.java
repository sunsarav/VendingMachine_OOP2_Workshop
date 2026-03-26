package se.lexicon;

import java.util.Scanner;

public class ConsoleUI {
    private final IVendingMachine machine = new VendingMachineImpl();
    Scanner scanner = new Scanner(System.in);

public void start() {
boolean running = true;

    while (running) {
        System.out.println("---VENDING MACHINE MENU---");
        System.out.println("1. View Products");
        System.out.println("2. Insert Coin");
        System.out.println("3. Purchase Product");
        System.out.println("4. Return Money");
        System.out.println("0. Cancel and Exit");
        System.out.println("Please Enter Your Choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                viewProducts();
                break;
            case 2:
                insertCoin();
                break;
            case 3:
                purchaseProduct();
                break;
            case 4: // Return Money
                System.out.println("Change: " + machine.returnChange());
                break;
            case 0: // Exit
                System.out.println("GoodBye!");
                running = false;
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

}
    // Method to View Products
    private void viewProducts() {
        for (Product p : machine.getProducts()) {
            System.out.println(p.getId() + " - " +
                    p.getName() + " Price: " +
                    p.getPrice() + " SEK - Quantity: " +
                    p.getQuantity());
        }
    }
    // Method to Insert Coin
    private void insertCoin() {
        System.out.println("Insert Coin (1, 2, 5, 10, 20 or 50): ");
        int coin = scanner.nextInt();
        machine.insertCoin(coin);
    }
    // Method to Buy Product
    private void purchaseProduct() {
        System.out.println("Enter Product id: ");
        int id = scanner.nextInt();
        Product p = machine.purchaseProduct(id);
                if (p != null) {
        System.out.println("Bought: " + p.getName());
    }
    }


}
