package vendingmachine;

public enum Drink {
    ORANGE_JUICE(1000);

    private final int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
