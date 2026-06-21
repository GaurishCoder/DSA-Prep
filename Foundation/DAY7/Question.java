package DAY7;

import java.util.HashMap;

public class Question {
    public static void findHighestAndLowestCountElement(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }


        for (var i : map.entrySet()) {
            int key = i.getKey();
            int count = i.getValue();
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = key;
            }
            if (count < minFreq) {
                minElement = key;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        findHighestAndLowestCountElement(arr);

    }

}
