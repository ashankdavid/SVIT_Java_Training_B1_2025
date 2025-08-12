package DataStructures.BinarySearchTree;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    BST(){
        root = null;
    }

    private Node insertRec(Node root, int key){ // Helper Function for Insert
        if(root == null){
            return new Node(key);
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }return root;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.key == key)
            return true;
        if(key < root.key){
            return searchRec(root.left, key);
        }else{
            return searchRec(root.right, key);
        }
    }

    public boolean search(int key){
        return searchRec(root, key);
    }

    public void remove(){

    }

    void dfs(Node root){
        if(root==null) {return ;}
        dfs(root.left);
        System.out.print(root.key + " ");
        dfs(root.right);
    }
}

class DriverCode{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(30);
        bst.insert(60);
        bst.insert(55);
        bst.insert(120);
        bst.insert(110);
        bst.insert(140);
        bst.insert(180);
        bst.dfs(bst.root);

        int key = 200;
        System.out.println(bst.search(key));
    }
}
