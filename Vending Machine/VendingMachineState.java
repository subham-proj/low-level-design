public interface VendingMachineState {
    void selectProduct(Product product);
    void insertCoins(Coin coin);
    void insertNotes(Note note);
    void dispenseProduct();
    void returnChange();
}
