import java.util.List;

public class Inventory {
    
    public boolean isAvailable(Product product) {
        return product.getQuantity() != 0;
    }
    
    public Product productDetails(Product product) {
        return product;
    }
}
