public class DispenseState implements VendingMachineState {
    private VendingMachine vendingMachine;
    
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(Product product) {
    
    }
    
    @Override
    public void insertCoins(Coin coin) {
    
    }
    
    @Override
    public void insertNotes(Note note) {
    
    }
    
    @Override
    public void dispenseProduct() {
    
    }
    
    @Override
    public void returnChange() {
    
    }
}
