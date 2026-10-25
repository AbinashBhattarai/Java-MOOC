import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override 
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        Item compare = (Item) object;
        if (Objects.equals(compare.getName(), this.getName())) {
            return true;
        }
        return false;
    }

    @Override 
    public int hashCode() {
        int hash = 97;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
