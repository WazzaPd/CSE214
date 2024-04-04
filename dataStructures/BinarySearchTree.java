public class BinarySearchTree {
    private int nodeCount = 0;

    private Node root = null;

    public class Node {
        int data;
        Node left, right;

        public Node (Node left, Node right, int elem){
            this.data = elem;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size() {
        return nodeCount;
    }

    //Unique elements only
    public boolean add(int elem){
        
        if(contains(elem)){
            return false;
        }

        else {
            root = add(root, elem);
            nodeCount++;
            return true;
        }
    }

    private Node add(Node node, int elem){
        if (node == null){
            node = new Node (null, null, elem);
        } else {
            if (elem - node.data< 0) {
                node.left = add(node.left, elem);
            } else{
                node.right = add(node.right, elem);
            }
        }
        return node;
    }

    public boolean remove(int elem){

        //in tree, proceed to remove
        if (contains(elem)){
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
        return false;
    }

    private Node remove(Node node, int elem){
        
        if(node == null) return null;
        
        int cmp = elem - node.data;

        if(cmp < 0) {
            node.left = remove(node.left, elem);
        }
        else if(cmp > 0){
            node.right = remove(node.right, elem);
        }
        else{
            //if left subtree is empty, replace current with right subtree
            if(node.left == null){
                Node rightChild = node.right;

                node = null;

                return rightChild;
            }
            //if right subtree is empty, replace current with left subtree
            else if(node.right == null){
                Node leftChild = node.left;

                node = null;

                return leftChild;   
            }
            else {
                //if both, replace with smallest(leftmost) node in the right subtree
                Node tmp = digLeft(node.right);

                node.data = tmp.data;
                node.right = remove(node.right, tmp.data);
            }
        }

        return node;
    }

    //helper methods
    // find the rightmost node
    private Node digLeft(Node node){
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public boolean contains(int elem){
        return contains(root, elem);
    }

    //recursive
    private boolean contains(Node node, int elem){
        
        //base case
        if (node == null) return false;
        
        int cmp = elem-node.data;

        if(cmp < 0) return contains(node.left, elem);

        else if(cmp > 0) return contains (node.right, elem);

        else return true;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return 0;
        return Math.max( height(node.left), height(node.right)) + 1;
    }

    public void PrintRanges(int a, int b){
        PrintRange(root, a, b);
    }
    public void PrintRange(Node curr, int a, int b){
        if (curr == null) return;
        if (curr.left != null && curr.left.data - a >= 0)
            PrintRange(curr.left, a, b);
        
        System.out.println(curr.data);

        if (curr.right != null && curr.right.data - b <= 0)
            PrintRange(curr.right, a, b);

    }

    public static void main(String Args[]){
        BinarySearchTree a = new BinarySearchTree();
        a.add(8);
        a.add(5);
        a.add(3);
        a.add(7);
        a.add(9); 
        a.PrintRanges(4, 8);
    }
}
