public class ReceiptMain {

    public static void main(String[] args) {
        Receipt r = new Receipt("HWR Shop");
        r.add(new ReceiptItem("Steaks", 3, 3.99));
        r.add(new ReceiptItem("Milch", 1, 1.39));
        r.add(new ReceiptItem("Magnum", 2, 2.99));
        r.print();

        /* Test case
        System.out.println("");
        Receipt y = new Receipt("Obst Shop");
        y.add(new ReceiptItem("Apfel", 3, 0.39));
        y.add(new ReceiptItem("Kiwi", 1, 0.59));
        y.add(new ReceiptItem("Mango", 2, 1.99));
        y.print();
         */
    }
}
