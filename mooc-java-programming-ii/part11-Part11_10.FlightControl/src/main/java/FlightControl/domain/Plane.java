package FlightControl.domain;

public class Plane {
    private String ID;
    private int capacity;

    public Plane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public String getID() {
        return this.ID;
    }

    @Override 
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
