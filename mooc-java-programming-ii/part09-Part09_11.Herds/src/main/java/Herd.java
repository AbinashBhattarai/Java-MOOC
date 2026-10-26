import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    public String toString() {
        String result = "";
        for (Movable organism : this.organisms) {
            result = result + organism + "\n";
        }
        return result;
    }

    @Override 
    public void move(int dx, int dy) {
        for (Movable organism : this.organisms) {
            organism.move(dx, dy);
        }
    }
}
