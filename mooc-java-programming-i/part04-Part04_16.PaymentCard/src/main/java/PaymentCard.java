public class PaymentCard {
    private double balance;
    private final double affordableLimit;
    private final double heartyLimit;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordableLimit = 2.6;
        this.heartyLimit = 4.6;
    }

    public void eatAffordably() {
        if(this.balance >= affordableLimit) {
            this.balance -= affordableLimit;
        }
    }

    public void eatHeartily() {
        if(this.balance >= heartyLimit) {
            this.balance -= heartyLimit;
        }
    }

    public void addMoney(double amount) {
        if(amount < 0) {
            return ;
        }

        this.balance += amount;

        if(this.balance > 150) {
            this.balance = 150;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
