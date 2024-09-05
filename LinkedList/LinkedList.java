public class Main {

    static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        // Getter for data
        public int getData() {
            return data;
        }

        // Setter for data
        public void setData(int data) {
            this.data = data;
        }

        // Getter for next
        public Node getNext() {
            return next;
        }

        // Setter for next
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Creating individual nodes
        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(13);
        Node fourthNode = new Node(2);

        // Linking nodes together
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        // Printing linked list
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
