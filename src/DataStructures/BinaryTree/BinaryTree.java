package DataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    static Node createNode(int val){
        return new Node(val);
    }

    void dfs(Node root){
        if(root==null){
            return ;
        }

        dfs(root.left);
        dfs(root.right);
        System.out.print(root.data + " ");
    }

    void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = createNode(1); // Level 1

        root.left = createNode(2); // Level 2
        root.right = createNode(3);

        root.left.left = createNode(4); // Level 3
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);

        root.left.right.left = createNode(8); // Level 4
        root.right.left.left = createNode(9);
        root.right.left.right = createNode(10);

        bt.bfs(root);

    }
}



