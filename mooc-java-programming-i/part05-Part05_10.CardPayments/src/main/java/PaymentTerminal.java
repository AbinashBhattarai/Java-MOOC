
public class PaymentTerminal {
    private static final double AFFORDABLE_MEAL_COST = 2.50;
    private static final double HEARTY_MEAL_COST = 4.30;

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < AFFORDABLE_MEAL_COST) {
            return payment;
        }
        affordableMeals++;
        this.money += AFFORDABLE_MEAL_COST;
        return payment - AFFORDABLE_MEAL_COST;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < HEARTY_MEAL_COST) {
            return payment;
        }
        heartyMeals++;
        this.money += HEARTY_MEAL_COST;
        return payment - HEARTY_MEAL_COST;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (!card.takeMoney(AFFORDABLE_MEAL_COST)) {
            return false;
        }
        affordableMeals++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (!card.takeMoney(HEARTY_MEAL_COST)) {
            return false;
        }
        heartyMeals++;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
