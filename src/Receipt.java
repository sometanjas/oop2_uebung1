import java.util.ArrayList;


public class Receipt {

    private String name;
    private ArrayList<ReceiptItem> itemList = new ArrayList<>();

    // Constructor
    public Receipt(String name) {
        this.name = name;
    }

    public void add(ReceiptItem receiptItem) {
        itemList.add(receiptItem);
    }

    public double totalSum() {
        double totalSum = 0;
        for (ReceiptItem i : itemList) {
            totalSum += i.calItemPrice();
        }
        return Math.round(totalSum * 100.0) / 100.0;
        // Alternative Math.floor((totalSum * 100) / 100);
    }

    // Ausgabe aller Zahlen
    public void print() {
        System.out.println("*** " + name + " ***");
        System.out.println("---");
        for (ReceiptItem i : itemList) {
            System.out.println(i);
            //Alternative zu neuer Methode aus ReceiptItem-Classe:
            // i.printItemLine();
            // totalSum += i.getItemPrice
        }
        System.out.println("---");
        System.out.println("Summe\t\t" + totalSum());
    }
}