import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() > this.maxWeight) {
            return;
        }
        this.items.add(item);
    }

    public int totalWeight() {
        if (this.items.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item haviestItem = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > haviestItem.getWeight()) {
                haviestItem = item;
            }
        }
        return haviestItem; 
    }

    @Override 
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } 

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + "kg)";
    }
}
