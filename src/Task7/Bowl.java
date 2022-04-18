package Task7;

public class Bowl {
    private int foodAmount;
    private boolean isEmpty = true;

    public void putFood(int amount) {
        if (amount > 0) {
            this.foodAmount += amount;
            isEmpty = false;
            System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
        }
    }
    //Реализация позволяет котику съесть меньше чем он хочет, если пищи недостаточно.
    public int decreaseFood(int amount) {
        if (amount < this.foodAmount) {
            this.foodAmount -= amount;
            return amount;
        } else {
            amount = this.foodAmount;
            this.foodAmount = 0;
            isEmpty = true;
            return amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
