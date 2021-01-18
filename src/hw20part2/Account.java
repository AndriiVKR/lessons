package hw20part2;

public class Account {

    private double amount;
    private String owner;

    public Account(double amount, String owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
