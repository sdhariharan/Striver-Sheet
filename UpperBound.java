public class UpperBound {

    public static void main(String[] args) {

        int nums[] = {1, 3, 4, 4, 5};

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        int target = 2;

        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        System.out.println("Upper Bound Index: " + ans);
    }
}