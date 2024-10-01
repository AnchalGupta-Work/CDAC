// Implemented doubly linked list and methods like add at beginning,end and at position. Deletion method at beginning,end and at position.

class prob1 {
    public static void main(String[] args) {
        DL li = new DL();
        li.addB(10);   
        li.addE(20);   
        li.addE(40);   
        li.addP(2, 30); 
        li.deleteP(1); 
        
        li.display(); 
    }
}

class DL {
    Node head;
    
    class Node {
        int data;
        Node next;
        Node prev;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    // Add at the beginning
    void addB(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    
    // Add at the end
    void addE(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }
    
    // Add at a specific position
    void addP(int p, int data) {
        if (p == 0) {
            addB(data);
            return;
        }
        
        Node newnode = new Node(data);
        Node temp = head;
        
        // Traverse to the position (p-1)
        for (int i = 0; i < p - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) {
            System.out.println("Out of bounds");
            return;
        }
        
        newnode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newnode;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }
    
    // Delete the first element
    void deleteB() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    
    // Delete the last element
    void deleteE() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }
    
    // Delete the element at a specific position
    void deleteP(int p) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (p == 0) {
            deleteB();
            return;
        }
        
        Node temp = head;
        for (int i = 0; i < p && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }
    
    // Display the list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
    }
}
