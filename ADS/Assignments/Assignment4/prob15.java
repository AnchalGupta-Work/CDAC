// Find the middle element of a linked list in one pass
class prob15 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll.middle());
        ll.display();
    }
}

class LinkedList {
    Node head;
    
    void add(int data) {
        Node newnode = new Node(data);
        if(head==null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    
    void display() {
      if(head==null) {
          return;
      }
      Node temp = head;
      while(temp!=null) {
          System.out.print(temp.data+"--");
          temp = temp.next;
      }
      System.out.println("null");
  }
  
  int middle() {
      Node slow = head;
      Node fast = head;
      while(fast!=null && fast.next!=null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow.data;
  }
}
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}