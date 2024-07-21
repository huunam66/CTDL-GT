import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashMapImpl implements IHashMap {

    private final class Data{
        private final int key;
        private int value;

        public Data(int key) {
           this(key, 0);
        }


        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Data){
                return this.key == ((Data)obj).getKey();
            }
            return false;
        }


        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }


        @Override
        public String toString() {
            return "[" + key + ", " + value + "]";
        }

        
    }

    
    private final int SIZE = 1000;
    private List<Data>[] buckets;

    public HashMapImpl(){
        buckets = new ArrayList[SIZE];
        for(int i = 0; i < SIZE; i++) buckets[i] = new ArrayList<>();
    }

    private int hashFunc(int key){
        return key % SIZE;
    }


    @Override
    public int get(int key) {
        int index = hashFunc(key);
        List<Data> bucket = buckets[index];
        int indexOfData = bucket.indexOf(new Data(key));

        if(indexOfData < 0) return -1;
        
        return bucket.get(indexOfData).getValue();
    }

    @Override
    public void put(int key, int value) {
        int index = hashFunc(key);
        List<Data> bucket = buckets[index];

        Data data = new Data(key, value);
        int indexOfData = bucket.indexOf(data);
        if(indexOfData < 0) bucket.add(data);
        else bucket.set(indexOfData, data);
    }

    @Override
    public void remove(int key) {
        int index = hashFunc(key);

        List<Data> bucket = buckets[index];

        int indexOfData = bucket.indexOf(new Data(key));
        if(indexOfData < 0) return;

        bucket.remove(indexOfData);
        
    }

    @Override
    public void show(){
        System.out.print("\n[");
        for(int i = 0; i < SIZE; i++){
            for(Data dt : buckets[i]){
                System.out.printf("%s, ", dt);
            }
        }
        System.out.print("]");
    }


    public static void main(String[] args) {
        IHashMap HashMap = new HashMapImpl();

        HashMap.put(1, 1); // The map is now [[1,1]]
        HashMap.show();
        HashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        HashMap.show();
        System.out.println("\nHashMap.get(1): " + HashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        System.out.println("\nHashMap.get(3): " + HashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        HashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        HashMap.show();
        System.out.println("\nHashMap.get(2): " + HashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        HashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        HashMap.show();
        System.out.println("\nHashMap.get(2): " + HashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]

        List<Integer> lst = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        Map<Integer, Integer> mp = new java.util.HashMap<>();
        for(int i = 1; i <= 5; i++){
            lst.add(i);
            st.add(i);
            mp.put(i, i + 1);
        }
        for(int i = 1; i <= 5; i++){
            lst.add(i);
            st.add(i);
            mp.put(i, i + 2);
        }
        System.out.println(lst.toString());
        System.out.println(st.toString());
        System.out.println(mp.toString());
        
    }

    
}
