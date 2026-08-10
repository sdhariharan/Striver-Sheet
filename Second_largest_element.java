public class Second_largest_element {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 5, 2};

        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first_max) {
                second_max = first_max;
                first_max = arr[i];
            }
            else if (arr[i] > second_max && arr[i] < first_max) {
                second_max = arr[i];
            }
        }

        if (second_max == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        }
        else {
            System.out.println("Second Largest Element: " + second_max);
        }
    }
}