public class BinaryTreeAllTravelsal {
        private TreeNode root;
        
        // Constructor
        public BinaryTreeAllTravelsal() {
            root = null;
        }
        
        // Inner class for tree nodes
        private class TreeNode {
            private int data;
            private TreeNode left;
            private TreeNode right;
            
            // Constructor for TreeNode
            public TreeNode(int data) {
                this.data = data;
                left = null;
                right = null;
            }
        }
        
        // Method to insert a new node in the tree
        public void insert(int data) {
            root = insertNode(root, data);
        }
        
        // Helper method to insert a new node in the tree
        private TreeNode insertNode(TreeNode node, int data) {
            if (node == null) {
                node = new TreeNode(data);
            } else {
                if (data <= node.data) {
                    node.left = insertNode(node.left, data);
                } else {
                    node.right = insertNode(node.right, data);
                }
            }
            return node;
        }
        
        // Method to traverse the tree in-order
        public void inorderTraversal() {
            inorder(root);
        }
        
        // Helper method to traverse the tree in-order
        private void inorder(TreeNode node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.data + " ");
                inorder(node.right);
            }
        }
        
        // Method to traverse the tree pre-order
        public void preorderTraversal() {
            preorder(root);
        }
        
        // Helper method to traverse the tree pre-order
        private void preorder(TreeNode node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preorder(node.left);
                preorder(node.right);
            }
        }
        
        // Method to traverse the tree post-order
        public void postorderTraversal() {
            postorder(root);
        }
        
        // Helper method to traverse the tree post-order
        private void postorder(TreeNode node) {
            if (node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.print(node.data + " ");
            }
        }
        
        // Main method to test the binary tree implementation
        public static void main(String[] args) {
            BinaryTreeAllTravelsal tree = new BinaryTreeAllTravelsal();
            tree.insert(5);
            tree.insert(3);
            tree.insert(7);
            tree.insert(1);
            tree.insert(9);
            
            System.out.println("In-order traversal:");
            tree.inorderTraversal();
            
            System.out.println("\nPre-order traversal:");
            tree.preorderTraversal();
            
            System.out.println("\nPost-order traversal:");
            tree.postorderTraversal();
        }
    
}
