public class Missing_Element {
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int[] hash = new int[arr.length + 1];

        
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }

        for (int i = 0; i <= arr.length; i++) {
            if (hash[i] == 0) {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }
}