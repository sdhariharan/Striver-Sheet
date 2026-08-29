public class Nthroot {

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long ans = 1;

            // Calculate mid^n
            for (int i = 0; i < n; i++) {

                ans *= mid;

                // Stop if already greater than m
                if (ans > m)
                    break;
            }

            if (ans == m) {

                System.out.println("Nth root : " + mid);
                return;

            } else if (ans < m) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        System.out.println("Nth root does not exist");
    }
}