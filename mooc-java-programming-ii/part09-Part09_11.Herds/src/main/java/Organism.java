public class Organism implements Movable {
    private int xAxis;
    private int yAxis;

    public Organism(int x, int y) {
        this.xAxis = x;
        this.yAxis = y;
    }

    @Override 
    public void move(int dx, int dy) {
        this.xAxis += dx;
        this.yAxis += dy;
    }

    public String toString() {
        return "x: " + this.xAxis + "; y: " + this.yAxis;
    }
}
