public class Union_of_two_sorted_array {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 5};

        int ptr1 = 0, ptr2 = 0;
        int k = 0;

        int[] res = new int[arr1.length + arr2.length];

        while (ptr1 < arr1.length && ptr2 < arr2.length) {

            int value;

            if (arr1[ptr1] < arr2[ptr2]) {
                value = arr1[ptr1++];
            }
            else if (arr1[ptr1] > arr2[ptr2]) {
                value = arr2[ptr2++];
            }
            else {
                value = arr1[ptr1];
                ptr1++;
                ptr2++;
            }

            if (k == 0 || res[k - 1] != value) {
                res[k++] = value;
            }
        }

        while (ptr1 < arr1.length) {
            int value = arr1[ptr1++];

            if (k == 0 || res[k - 1] != value) {
                res[k++] = value;
            }
        }

        while (ptr2 < arr2.length) {
            int value = arr2[ptr2++];

            if (k == 0 || res[k - 1] != value) {
                res[k++] = value;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(res[i]);
        }
    }
}