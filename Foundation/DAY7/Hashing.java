package DAY7;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 3, 12 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (map.containsKey(key)) {
                freq = map.get(key);
            }
            freq++;
            map.put(key, freq);
        }
        int num = 12;
        System.out.println("count of number:"+map.get(num));
    }
}
