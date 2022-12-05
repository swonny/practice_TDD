package vendingmachine;

public enum Coin {
    TEN(10),
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500);
    
    private final int amount;
    
    Coin(int amount) {
        this.amount = amount;
    }

    public Coin getSmallerCoin() {
        for (Coin coin : Coin.values()) {
            if (coin.amount < this.amount) {
                return coin;
            }
        }
        return null;
    }

    public int get() {
        return this.amount;
    }
}
