public class Item {
    int price;
    double weight;
    int quantity;
    String description;
    boolean canBeTraded;

    public void getDescription() {
        System.out.println(description);
    }
    
    public Item(int pri, double wg, int qt, String des, boolean cbt) {
        price = pri;
        weight = wg;
        quantity = qt;
        description = des;
        canBeTraded = cbt;
    }
}
