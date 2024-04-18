//package BinaryTreeTraversal;

// Node class representing a node in the binary tree
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;   // Assign the value to the node
        left = right = null;    // Initialize the left and right child nodes as null
    }
}

// Binary Tree class containing methods for tree traversal
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;    // Initialize the root node as null
    }

    // Method to perform inorder traversal recursively
    void inorderTraversal(Node node) {  // Inorder is when the root is visited in between 
        if (node != null) { //  Base case: If the node is null, return
            inorderTraversal(node.left);    // Traverse the left subtree
            System.out.print(node.data + " "); // Print the data of the node
            inorderTraversal(node.right);   // Traverse the right subtree
        }
    }

    // Method to perform preorder traversal recursively
    void preorderTraversal(Node node) { // preorder is when the root is visited first
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Method to perform postorder traversal recursively
    void postorderTraversal(Node node) {    //Postorder is when the root is visited last
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    void printTree(Node node, String indent) {
        if (node != null) {
            printTree(node.right, indent + "   ");
            System.out.println(indent + node.data);
            printTree(node.left, indent + "   ");
        }
    }
}

// Main class demonstrating the usage of BinaryTree class
public class Recursion {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();

        // Add nodes to the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorderTraversal(tree.root);

        System.out.println("\n\nBinary tree:");
        tree.printTree(tree.root, "");
    }
}