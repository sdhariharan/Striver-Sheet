public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void add(int data) {

        Node nextNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = nextNode;
            return;
        }

        // Find the last node
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Connect last node to new node
        currNode.next = nextNode;
    }

    void display() {

        Node temp = head;

        System.out.println("Nodes:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();
    }
}