//Java class Dog
public class Dog {
    // instance variable
    private int drinkTime;

    // method to set drink time
    public void setDrinkTime(int n) {
        this.drinkTime = n;// set the drink time
    }

    // method to get the drink time
    public int getDrinkTime() {
        return this.drinkTime;
    }

    // method needsToGo()
    public boolean needsToGo() {
        // checking drinkTime
        if (this.drinkTime > 4) {
            // when drink time is greater than then
            return true;
        } else {
            return false;
        }
    }
}