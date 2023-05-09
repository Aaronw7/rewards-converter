public class RewardValue {
//        2 constructors: accepts cash value, accepts miles value
//        getCashValue() method
//        getMilesValue() method
//        miles to cash rate is 0.0035
    private double cashValue;
    private int milesValue;

    private static final double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = calculateMilesValue(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashValue(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private double calculateCashValue(int milesValue) {
        return milesValue * milesToCashRate;
    }

    private int calculateMilesValue(double cashValue) {
        return (int)(cashValue / milesToCashRate);
    }
}
