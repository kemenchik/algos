package structurs.HashMap;

import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K, V> {
    private final int CAPACITY = 16;
    private final List<Entry<K, V>>[] table = new List[CAPACITY];

    public CustomHashMap() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new ArrayList<>();
        }
    }

    private int hash(K key) {
        return key.hashCode() % CAPACITY;
    }

    public boolean isEmpty() {
        for (List<Entry<K, V>> entryList : table) {
            if (!entryList.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean containsKey(K key) {
        if (key == null) {
            return false;
        }
        int location = hash(key);
        for (Entry<K, V> entry : table[location]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (List<Entry<K, V>> entryList : table) {
            for (Entry<K, V> entry : entryList) {
                if (entry.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Entry<K, V> get(K key) {
        if (key == null) {
            return null;
        }
        int location = hash(key);
        for (Entry<K, V> entry : table[location]) {
            if (entry.key.equals(key)) {
                return entry;
            }
        }
        return null;
    }

    public V put(K key, V val) {
        if (key == null) {
            return null;
        }
        int location = hash(key);
        List<Entry<K, V>> list = table[location];
        if (containsKey(key)) {
            get(key).value = val;
        } else {
            list.add(new Entry<>(key, val));
        }
        return val;
    }


    public V remove(K key) {
        int location = hash(key);
        V value = null;
        for (Entry<K, V> entry : table[location]) {
            if (entry.key.equals(key)) {
                value = entry.value;
                table[location].remove(entry);
            }
        }
        return value;
    }


    private static class Entry<K, V> {
        public K key;
        public V value;

        public Entry(K key, V val) {
            this.key = key;
            this.value = val;
        }

        @Override
        public int hashCode() {
            int prime = 13;
            int mul = 11;
            if (key != null) {
                int hashCode = key.hashCode();
                hashCode *= prime * mul + hashCode;
                hashCode *= prime * mul + hashCode;
                return hashCode;
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass().getName() != o.getClass().getName()) {
                return false;
            }
            Entry e = (Entry) o;
            return this.key.equals(e.key);
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}