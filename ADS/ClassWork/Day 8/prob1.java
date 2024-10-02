// Basic binary tree implementation

class BT {
     Node root;
     
     void printInOrder(Node root) {
         if(root==null) {
             return;
         }
         printInOrder(root.left);
         System.out.print(root.data+" ");
         printInOrder(root.right);
     }
     
     void inOrder() {
         printInOrder(root);
     }
    
    public static void main(String[] args) {
        BT bt = new BT();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.inOrder();
        
    }
}


class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}