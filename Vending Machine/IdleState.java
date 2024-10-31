public class IdleState implements VendingMachineState {
    
    private VendingMachine vendingMachine;
    
    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.inventory.isAvailable(product)) {
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setState(vendingMachine.getReadyState());
        } else {
            System.out.println("Product not available: "+ product.getName());
        }
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
