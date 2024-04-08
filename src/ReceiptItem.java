public class ReceiptItem {

    private String product;
    private int count;
    private double price;

    public ReceiptItem(String product, int count, double price) {
        //Constructor
        this.product = product;
        this.count = count;
        this.price = price;
    }

    // noch zwei Methoden - 1. um Zahlen auszugeben + 2. den gesamten Price

     public double calItemPrice() {
        return this.count * this.price;
     }

    public String toString() {
        return product + "\t" + count + "x" + "\t" + price;
    }
}
