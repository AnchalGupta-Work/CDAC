// Detect a cycle in a linked list.
class prob3 {
    public static void main(String[] args) {
          LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.createCycle(2);
        
        if (ll.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }

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
  
  void createCycle(int position) {
      Node temp = head;
      Node cyclenode = null;
      int index = 1;
      
      while(temp!=null && temp.next!=null) {
          if(index==position) {
              cyclenode = temp;
          }
          temp = temp.next;
          index++;
          
      }
      if(temp!=null) {
          temp.next = cyclenode;
      }
      
  }
  
  boolean hasCycle() {
      if(head==null || head.next==null) {
          return false;
      } 
      Node slow = head;
      Node fast = head;
      
      while(fast!=null && fast.next!=null) {
          slow = slow.next;
          fast = fast.next.next;
          if(slow==fast) {
          return true;
      }
      }
      return false;
      
      
  }
  
 
}
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}