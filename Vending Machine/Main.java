public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        Product paintBrush = new Product("Paint Brush", 40, 0);
        Product pencil = new Product("Pencil", 5, 25);
        Product pen = new Product("Pen", 10, 50);
        Product notebook = new Product("Notebook", 70, 15);
        
        vendingMachine.addProduct(paintBrush);
        vendingMachine.addProduct(pencil);
        vendingMachine.addProduct(pen);
        vendingMachine.addProduct(notebook);
        
        vendingMachine.selectProduct(paintBrush);
        
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        
        vendingMachine.insertNote(Note.TEN);
        vendingMachine.insertNote(Note.TEN);
        vendingMachine.insertNote(Note.TEN);
        vendingMachine.insertNote(Note.FIVE);
        vendingMachine.insertNote(Note.FIVE);
        
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();
        
    }
}
