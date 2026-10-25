import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private double capacity;
    private List<Packable> packables;

    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() <= this.capacity) {
            packables.add(packable);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.packables) {
            weight += item.weight();
        }
        return weight;
    }

    @Override 
    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + weight() + " kg";
    }
}
