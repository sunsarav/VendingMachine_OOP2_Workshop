import se.lexicon.Fruit;
import se.lexicon.Product;
import se.lexicon.VendingMachineImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VendingMachineImplTest {
    private VendingMachineImpl vm;

    @BeforeEach
    public void setup() {
       vm = new VendingMachineImpl();

    }

    @Test
    public void testInsertValidCoin() {
        // Given: Balance is 0

        // When: Insert 10
        vm.insertCoin(10);

        // Then: Balance becomes 10
        assertEquals(10,vm.getBalance(), "The Balance should be 10 after inserting a 10 coin");
    }
    @Test
    public void testRejectInvalidCoin() {
        // Given: Balance is 0

        // When: Insert 7
        vm.insertCoin(7);

        //Then: Balance stays 0 - Coin rejected
        assertEquals(0,vm.getBalance(), "The Balance should not change when an invalid " +
                "coin is inserted.");
    }
    @Test
    void getProductsReturnsAllItems() {
        // Given: Machine has 3 products

        // When: Calling getProducts()
        List<Product> allProducts = vm.getProducts();

        // Then: List size is 0
        assertNotNull(allProducts, "Returned List should not be null");
        assertEquals(3,allProducts.size(),"Machine should contain exactly 3 Products");
    }

}



