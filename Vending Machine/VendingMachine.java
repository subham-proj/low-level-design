import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private static VendingMachine instance;
    private final List<Product> products;
    
    private Product selectedProduct;
    
    Inventory inventory;
    private VendingMachineState state;
    
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispenseState;
    private final VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private double totalPayment;
    
    private VendingMachine() {
        products = new ArrayList<>();
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        totalPayment = 0.0;
    }
    
    ;
    
    public static synchronized VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void selectProduct(Product product) {
        currentState.selectProduct(product);
    }
    
    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }
    
    public void insertNote(Note note) {
        currentState.insertNote(note);
    }
    
    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
    
    public void returnChange() {
        currentState.returnChange();
    }
    
    void setState(VendingMachineState state) {
        currentState = state;
    }
    
    public VendingMachineState getIdleState() {
        return idleState;
    }
    
    public VendingMachineState getReadyState() {
        return readyState;
    }
    
    public VendingMachineState getDispenseState() {
        return dispenseState;
    }
    
    public VendingMachineState getReturnChangeState() {
        return returnChangeState;
    }
    
    public Product getSelectedProduct() {
        return selectedProduct;
    }
    
    public void resetSelectedProduct() {
        selectedProduct = null;
    }
    
    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    
    void addCoin(Coin coin) {
        totalPayment += coin.getValue();
    }
    
    void addNote(Note note) {
        totalPayment += note.getValue();
    }
    
    public double getTotalPayment() {
        return totalPayment;
    }
    
    public void resetPayment() {
        totalPayment = 0.0;
    }
}
