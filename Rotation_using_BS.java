public class Rotation_using_BS {

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } 
            else {
                high = mid;
            }
        }

        System.out.println("No of Times Rotated : " + low);
    }
}