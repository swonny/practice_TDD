package vendingmachine;

public class VendingMachine {
    private int payment;
    private Drink selectedDrink;

    public void buy(int money) {
        payment = money;
    }

    public int getPayment() {
        return payment;
    }

    public void selectDrink(Drink drink) {
        selectedDrink = drink;
    }

    public int getDrinkPrice() {
        return selectedDrink.getPrice();
    }

    public int calculateChanges() {
        return payment - getDrinkPrice();
    }

    public int calculateChangesSize() {
        int count = 0;
        int changes = calculateChanges();
        Coin coin = Coin.FIVE_HUNDRED;
        while (changes > 0) {
            if (changes % coin.get() != 0) {
                coin = coin.getSmallerCoin();
            }
            count += (changes / coin.get());
            changes /= coin.get();
        }
        return count;
    }
}
