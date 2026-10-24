import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {

            List<String> items = this.storage.get(storageUnit);
            if (items != null) {
                items.remove(item);

                if (items.isEmpty()) {
                    this.storage.remove(storageUnit);
                }
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();

        for (String key : this.storage.keySet()) {
            if (!this.storage.get(key).isEmpty()) {
                keys.add(key);
            }
        }
        return keys;
    }
}