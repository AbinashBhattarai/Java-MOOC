public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override 
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        addHistory(getBalance());
    }

    @Override 
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        addHistory(getBalance());
        return result;
    }

    private void addHistory(double amount) {
        this.history.add(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
