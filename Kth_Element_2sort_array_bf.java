public class Kth_Element_2sort_array_bf {

    public static int KthElement(int[] arr1, int[] arr2, int k, int m, int n) {

        // arr1 should be the smaller array
        if (m > n)
            return KthElement(arr2, arr1, k, n, m);

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {

            int mid1 = (low + high) >> 1;
            int mid2 = k - mid1;

            int left1 = (mid1 > 0)
                    ? arr1[mid1 - 1]
                    : Integer.MIN_VALUE;

            int right1 = (mid1 < m)
                    ? arr1[mid1]
                    : Integer.MAX_VALUE;

            int left2 = (mid2 > 0)
                    ? arr2[mid2 - 1]
                    : Integer.MIN_VALUE;

            int right2 = (mid2 < n)
                    ? arr2[mid2]
                    : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1)
                return Math.max(left1, left2);

            if (left1 > right2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 7, 9};
        int[] arr2 = {1, 4, 5};

        int m = arr1.length;
        int n = arr2.length;

        int k = 5;

        int ans = KthElement(arr1, arr2, k, m, n);

        System.out.println("Kth Element of Sorted Array : " + ans);
    }
}