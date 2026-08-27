public class FloorCeil {

    public int floor(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int ceil(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        FloorCeil obj = new FloorCeil();

        int arr[] = {1, 2, 4, 6, 8};

        System.out.println("Floor: " + obj.floor(arr, 5));
        System.out.println("Ceil: " + obj.ceil(arr, 5));
    }
}