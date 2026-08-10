import java.util.HashMap;

public class Longest_Subarray_equal_zero {
    public static void main(String[] args) {

        int[] arr = {15, -5, 5, -10, 5, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println("Longest SubArray: " + max);
    }
}