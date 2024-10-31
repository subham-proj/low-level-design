import java.util.List;

public class Inventory {
    public void getAvailableProducts(List<Product> products) {
        for (Product product : products) {
            if (product.getQuantity() != 0) {
                System.out.println(product.getQuantity() + " " + product.getName() + " is available.");
            }
        }
    }
    
    public void addProductInInventory(Product product, int quantity) {
        product.updateQuantity(quantity);
    }
    
    public boolean isAvailable(Product product) {
        return product.getQuantity() != 0;
    }
}
