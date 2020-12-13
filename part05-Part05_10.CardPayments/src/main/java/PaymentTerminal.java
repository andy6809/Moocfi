
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 2.5;
        double change = payment - meal;
        if (payment >= meal) {
            money += meal;
            affordableMeals++;
            return change;
        }
        return payment;

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double meal = 4.3;
        double change = payment - meal;
        if (payment >= meal) {
            money += meal;
            heartyMeals++;
            return change;
        }
        return payment;

    }

    public boolean eatAffordably(PaymentCard card) {
        double meal = 2.5;
        if (card.balance() >= meal) {
            affordableMeals++;

            card.takeMoney(meal);
            return true;

        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double meal = 4.3;
        if (card.balance() >= meal) {
            heartyMeals++;
            return card.takeMoney(meal);
        }
        return false;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
