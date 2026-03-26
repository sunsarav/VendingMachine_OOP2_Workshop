package se.lexicon;

import java.util.List;

public interface IVendingMachine {

    void insertCoin(int coin);
    int getBalance();
    void purchaseProduct(int productId);
    int returnChange();
    List<Product> getProducts();

}
