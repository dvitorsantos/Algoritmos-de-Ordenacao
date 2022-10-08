package elements;

import interfaces.Pair;

public class Element<K extends Comparable<K>, V> implements Pair<K, V> {
    private K key;
    private V value;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
}
