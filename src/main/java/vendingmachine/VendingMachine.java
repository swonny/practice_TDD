package vendingmachine;

public class VendingMachine {
    private int payment;

    public void buy(int money) {
        payment = money;
    }

    public int getPayment() {
        return payment;
    }
}
