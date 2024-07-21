import java.util.ArrayList;
import java.util.List;

public class MyHashSet implements IHashSet{

    private final int SIZE = 1000;
    private List<Integer>[] buckets;

    public MyHashSet(){
        this.buckets = new ArrayList[SIZE];
        for(int i = 0; i < SIZE; i++) buckets[i] = new ArrayList<>();
    }

    private int hashFunc(int key){
        return key % 1000;
    }

    @Override
    public void add(int key) {
        int index = hashFunc(key);

        List<Integer> bucket = buckets[index];
        if(!contains(key)) bucket.add(key);
    }
    
    @Override
    public void remove(int key) {
        int index = hashFunc(key);
        if(contains(key)) {
            int indexOfKey = buckets[index].indexOf(key);
            buckets[index].remove(indexOfKey);
        }
    }
    
    @Override
    public boolean contains(int key) {
        int index = hashFunc(key);
        return buckets[index].contains(key);
    }

    @Override
    public void show(){
        System.out.println();
        for(int i = 0; i < SIZE; i++){
            for(int key : buckets[i]){
                System.out.printf("%d ", key);
            }
        }
    }


    public static void main(String[] args) {
        IHashSet hashSet = new MyHashSet();

        hashSet.add(1);      // set = [1]
        hashSet.show();
        hashSet.add(2);      // set = [1, 2]
        hashSet.show();
        System.out.println("\nhashSet.contains(1): " + hashSet.contains(1));// return True
        System.out.println("\nhashSet.contains(3): " + hashSet.contains(3)); // return False, (not found)
        hashSet.add(2);      // set = [1, 2]
        hashSet.show();
        System.out.println("\nhashSet.contains(2): " + hashSet.contains(2)); // return True
        hashSet.remove(2);   // set = [1]
        hashSet.show();
        System.out.println("\nhashSet.contains(2): " + hashSet.contains(2)); // return False, (already removed)
    }
    
}