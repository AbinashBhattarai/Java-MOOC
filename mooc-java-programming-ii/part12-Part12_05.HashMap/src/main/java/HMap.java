import java.util.List;

public class HMap<K,V> {
    private ArryList<Pair<K, V>>[] values;
    private int freeIndex;

    public HMap() {
        this.values = new ArryList[32];
        this.freeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);

        if (this.values[hashValue] == null) {
            return null;
        }

        ArryList<Pair<K, V>> list = this.values[hashValue];

        for (int i = 0; i < list.size(); i++) {
            if (list.value(i).getKey().equals(key)) {
                return list.value(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        ArryList<Pair<K, V>> list = getListBasedOnKey(key);
        int index = getIndexOfKey(list, key);

        if (index < 0) {
            list.add(new Pair<>(key, value));
            freeIndex++;
        } else {
            list.value(index).setValue(value);
        }

        if (1.0 * this.freeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private ArryList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new ArryList<>();
        }
        return this.values[hashValue];
    }

    private int getIndexOfKey(ArryList<Pair<K, V>> list, K key) {
        for (int i = 0; i <list.size(); i++) {
            if (list.value(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1; 
    }

    private void grow() {
        ArryList<Pair<K, V>>[] newValues = new ArryList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }

        this.values = newValues;
    }

    private void copy(ArryList<Pair<K, V>>[] newValues, int index) {
        for (int i = index; i < this.values[index].size(); i++) {
            Pair<K, V> value = this.values[index].value(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newValues.length);
            if (newValues[hashValue] == null) {
                newValues[hashValue] = new ArryList<>();
            }

            newValues[hashValue].add(value);    
        }
    }

    public V remove(K key) {
        ArryList<Pair<K, V>> list = getListBasedOnKey(key);

        if (list.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(list, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = list.value(index);
        list.remove(pair);
        return pair.getValue();
    }
}
