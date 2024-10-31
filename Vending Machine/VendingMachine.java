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
    
    private VendingMachine() {
        products = new ArrayList<>();
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
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
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public VendingMachineState getState() {
        return state;
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
    
    public Product getSelectedProduct() {
        return selectedProduct;
    }
    
    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
}
