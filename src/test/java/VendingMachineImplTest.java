import se.lexicon.VendingMachineImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    public void purchaseProductSuccessfully() {
        // Given: product price is 20, product quantity is 3 & balance is 0
        int productId = 1;
        vm.
        // When: insert 20

        vm.insertCoin(20);

        // Then: Purchase success, balance 0, Quantity 2
        assertEquals(0,vm.getBalance());
    }


}
