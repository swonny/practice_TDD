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

    @Test
    public void testSelectDrink() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.buy(2000);
        vendingMachine.selectDrink(Drink.ORANGE_JUICE);
        assertThat(vendingMachine.getDrinkPrice()).isEqualTo(Drink.ORANGE_JUICE.getPrice());
    }

    @Test
    public void testCalculateChanges() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.buy(1500);
        vendingMachine.selectDrink(Drink.ORANGE_JUICE);
        assertThat(vendingMachine.calculateChanges())
                .isEqualTo(500);
    }

    @Test
    public void testCalculateChanges_2() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.buy(1900);
        vendingMachine.selectDrink(Drink.ORANGE_JUICE);
        assertThat(vendingMachine.calculateChanges())
                .isEqualTo(900);
    }

    @Test
    public void testCalculateChangesSize() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.buy(1500);
        vendingMachine.selectDrink(Drink.ORANGE_JUICE);
        assertThat(vendingMachine.calculateChangesSize()).isEqualTo(1);
    }
}
