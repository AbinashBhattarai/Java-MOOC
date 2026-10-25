import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private List<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override 
    public void add(Item item) {
        if (item.getWeight() + weightOfItems() > this.capacity) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override 
    public String toString() {
        String result = "";
        for (Item item : this.items) {
            result = result + item.getName() + "\n";
        }
        return result;
    }
}
