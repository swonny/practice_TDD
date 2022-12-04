package vendingmachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VendingMachineTest {
    @Test
    public void testBuy() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.buy(1000);
        assertThat(vendingMachine.getPayment()).isEqualTo(1000);
    }
}
