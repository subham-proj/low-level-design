public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        vendingMachine.addProduct(new Product("Paint Brush", 40, 10));
        vendingMachine.addProduct(new Product("Pencil", 5, 25));
        vendingMachine.addProduct(new Product("Pen", 10, 50));
        vendingMachine.addProduct(new Product("Notebook", 70, 15));
        
    }
}
