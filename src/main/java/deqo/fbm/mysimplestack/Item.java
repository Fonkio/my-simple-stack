package deqo.fbm.mysimplestack;

public class Item {
    private String value;
    private int amount;

    public Item(String test, int i) {
        value = test;
        amount = i;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }
}
