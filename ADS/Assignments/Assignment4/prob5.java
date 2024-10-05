// Find the nth node from the end of a linked list.

class prob5 {
    public static void main(String[] args) {
          LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll.find(4));
         }
}

class LinkedList {
    Node head;
    
    int find(int p) {
        Node temp = head;
        int count = 0;
        
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        
        if(count<1 || p>count){
            return -1;
        }
        
        temp = head;
        for(int i=1 ; i<count-p+1 ;i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
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
   }

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}