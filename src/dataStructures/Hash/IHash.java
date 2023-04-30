package dataStructures.Hash;

public interface IHash<K extends Comparable<K>, V> {

    void insert(K key, V value) throws Exception;

    V search(K key);

    void delete(K key);

}
