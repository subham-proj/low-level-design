public enum Coin {
    PENNY(0.01),
    DIME(0.10),
    QUARTER(0.25);
    
    private final double value;
    Coin(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
}
