
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.keySet().contains(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocks.keySet().contains(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!this.stocks.keySet().contains(product)) {
            return false;
        }
        int stock = this.stocks.get(product);
        if (stock > 0) {
            stock--;
            this.stocks.put(product, stock);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return new HashSet<String>(this.prices.keySet());
    }
}
