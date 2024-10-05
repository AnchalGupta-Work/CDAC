// Implement a singly linked list with basic operations: insert, delete, search.
class prob1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertB(10);
        list.insertE(20);
        list.insertE(30);
        list.insertP(15, 1);

        list.display();

        System.out.println("Searching for 20: " + list.search(20));
        System.out.println("Searching for 40: " + list.search(40));

        list.delete(20);
        list.display();
    }
}

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertB(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertE(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertP(int data, int position) {
        if (position < 0) {
            System.out.println("Position cannot be negative.");
            return;
        }
        if (position == 0) {
            insertB(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1 &&temp!=null; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Element not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
