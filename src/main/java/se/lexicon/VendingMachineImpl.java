package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements IVendingMachine{

    private final List<Product> products = new ArrayList<>();
    private int balance = 0;

    public VendingMachineImpl() {

    products.add(new Snack(101,"- Estrella Grill Chips ->",25,7,true,
            175,520));
    products.add(new Beverage(201,"- Coca Cola ->",15,20,330,true,
            35.7));
    products.add(new Fruit(301,"- Banana ->",10,15,120,"Ripe"));
    }

    // Adds Money to the Machine, if the coin value is accepted
    @Override
    public void insertCoin(int coin) {
        if (coin == 1 || coin == 2 || coin == 5 || coin == 10 || coin == 20 || coin == 50) {
            balance += coin; // Increase total balance by coin's value
        } else {
            System.out.println("Invalid Coin");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product purchaseProduct(int productId) {
        // Find the Product
        for (Product p : products) {
            if (p.getId() == productId) {

                // Check for Problems
                if (p.getQuantity() == 0) {
                    System.out.println("Out Of Stock");
                    return null;
                }
                // Purchase is Successful
                if (balance < p.getPrice()) {
                    System.out.println("Not Enough Balance");
                    return null;
                }

            }
        }
        // Loop Finishes - Never found the ID
        System.out.println("Product Not Found");
        return null;
    }

    @Override
    public int returnChange() {
        int change = balance; // Store amount to return
        balance = 0;          // Reset Machine
        return change;
    }
}
