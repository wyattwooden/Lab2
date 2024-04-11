class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /*
   recursive insert method
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }


   /**
    * Traverse the tree going Node, Left, Right.
    * Prints out the value of each node.
    * @param root Starts method from root of tree.
    */
   public void preOrderTraversal(Node root){
      
      // base case
      if (root == null) {
         return;
      }
      
      // process node first
      System.out.print(root.value + " ");
      
      // go left
      preOrderTraversal(root.left);
      
      // go right 
      preOrderTraversal(root.right);
   }


   /**
    * Traverse the tree going Left, Node, Right.
    * Prints out the value of each node.
    * @param root Starts method from root of tree.
    */
   public void inOrderTraversal(Node root){

      // base case
      if (root == null) {
         return;
      }

      // go left
      inOrderTraversal(root.left);

      // process node
      System.out.println(root.value + " ");

      // go right
      inOrderTraversal(root.right);
   }


   /**
    * Traverse the tree going Left, Right, Node.
    * Prints out the value of each node.
    * @param root Starts method from root of tree.
    */
   public void postOrderTraversal(Node root){

      // base case
      if (root == null) {
         return;
      }

      // go left
      postOrderTraversal(root.left);

      // go right
      postOrderTraversal(root.right);

      // process node
      System.out.println(root.value + " ");
   }


   /**
    * Searching for int value in the binary tree.
    * Uses recursive calls to traverse the tree.
    * @param root Starts search from root of tree
    * @param key Integer value this method is looking for.
    * @return true if key found, else false
    */
   public boolean find(Node root, int key){

      // base case
      if (root == null) {
         return false;
      }

      // check if node equals parameter key int
      if (root.value == key) {
         return true;
      }

      // search left and right subtrees
      return find(root.left, key) || find(root.right, key);
   }
   
   
   
   /*
   a method to find the node in the tree
   with a smallest key
   */
   /*public int getMin(Node root){
      //implement me
   }*/
  
  
  
   /*
   a method to find the node in the tree
   with a largest key
   */
   /*public int getMax(Node root){
	  //implement me
   }*/
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
  /* public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }*/
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}