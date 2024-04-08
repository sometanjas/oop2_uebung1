public class ReceiptItem {

    private String product;
    private int count;
    private double price;

    //Constructor
    public ReceiptItem(String product, int count, double price) {
        this.product = product;
        this.count = count;
        this.price = price;
    }

    public double calItemPrice() {
        return this.count * this.price;
    }

    public String toString() {
        return product + "\t" + count + "x" + "\t" + price;
    }
}
