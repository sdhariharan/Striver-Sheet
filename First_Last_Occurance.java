class Solution {

    // Find first occurrence of target
    public int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // search on left
            }
            else if (arr[mid] < target) {
                low = mid + 1; // search on right
            }
            else {
                high = mid - 1; // search on left
            }
        }

        return first;
    }

    // Find last occurrence of target
    public int lastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // search on right
            }
            else if (arr[mid] < target) {
                low = mid + 1; // search on right
            }
            else {
                high = mid - 1; // search on left
            }
        }

        return last;
    }

    // Count occurrences
    public int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);

        // Target doesn't exist
        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }
}