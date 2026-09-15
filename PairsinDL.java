import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class PairsinDL {

    // Insert a node at the end of the DLL
    static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        // If DLL is empty
        if (head == null) {
            return newNode;
        }

        Node temp = head;

        // Go to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect new node
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Find all pairs whose sum equals target
    static ArrayList<ArrayList<Integer>> findPairs(Node head, int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (head == null) {
            return result;
        }

        // Find the right pointer (last node)
        Node right = head;

        while (right.next != null) {
            right = right.next;
        }

        // Left pointer starts from first node
        Node left = head;

        while (left != right && left.prev != right) {

            int sum = left.data + right.data;

            // Pair found
            if (sum == target) {

                ArrayList<Integer> pair = new ArrayList<>();

                pair.add(left.data);
                pair.add(right.data);

                result.add(pair);

                // Move both pointers
                left = left.next;
                right = right.prev;
            }

            // Sum is smaller → increase left
            else if (sum < target) {

                left = left.next;
            }

            // Sum is larger → decrease right
            else {

                right = right.prev;
            }
        }

        return result;
    }

    // Print the DLL
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;

        // Input DLL elements
        System.out.println("Enter elements in sorted order:");

        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();

            head = insert(head, data);
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Display DLL
        System.out.println("\nDoubly Linked List:");
        printList(head);

        // Find pairs
        ArrayList<ArrayList<Integer>> result =
                findPairs(head, target);

        // Display result
        System.out.println("\nPairs with sum " + target + ":");

        if (result.isEmpty()) {

            System.out.println("No pairs found.");

        } else {

            for (ArrayList<Integer> pair : result) {

                System.out.println(
                        "(" + pair.get(0) + ", " + pair.get(1) + ")"
                );
            }
        }

        sc.close();
    }
}