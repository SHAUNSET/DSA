import java.util.*;

class Bucket {
    private LinkedList<Integer> container;

    public Bucket() {
        this.container = new LinkedList<>();
    }

    public void insert(Integer val) {
        if (!this.container.contains(val)) {
            this.container.addFirst(val);
        }
    }

    public void remove(Integer val) {
        this.container.remove(val);
    }

    public boolean contains(Integer val) {
        return this.container.contains(val);
    }
}

class MyHashSet {

    private Bucket[] buckets;
    private int numBuckets = 769;  

    public MyHashSet() {
        this.buckets = new Bucket[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    private int getIndex(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucketIndex = getIndex(key);
        buckets[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = getIndex(key);
        buckets[bucketIndex].remove(key);
    }

    public boolean contains(int key) {
        int bucketIndex = getIndex(key);
        return buckets[bucketIndex].contains(key);
    }
}
