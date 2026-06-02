public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10);
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

   // preorder(stringRoot);
   // postorder(root);
   // inorder(root);
   //printGreaterThan(root, 4);
   System.out.println(countNodes(root));

  
  
   TreeNode<String> stringRoot = new TreeNode<Integer>(10);
    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("sdkjf");
    stringRoot.left.right = new TreeNode<>("sdf");

    stringRoot.right = new TreeNode<>("dfgdf");
     new TreeNode<>("dfgdf");
     new TreeNode<>("yo");
     new TreeNode<>("ey");

 };

 public static int countNodes (TreeNode<?> current) {
    if (current == null) return 0;
    // Count of all nodes in the left subtree
    int leftCount = countNodes(current.left);
    int rightCount = countNodes(current.right);

    int totalCount = 1 + leftCount + rightCount;

    return totalCount;
 }


    // Do a preorder traversal
    // but ONLY PRINT the nodes that are greater than our threshold
  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;
    if (current.value > threshold) {
      System.out.println(current.value);
    }
      printGreaterThan(current.left, threshold);
      printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode<?> current) {
    if (current == null) return;
   System.out.println(current.value);
   preorder(current.left);
   preorder(current.right);
   
  }

  public static <E> void postorder(TreeNode<E> current) {
    if (current == null) return;
    postorder (current.left);
    postorder (current.right);
    System.out.println(current.value);
  }

  public static void inorder(TreeNode current) {
    if (current == null) return;
    inorder (current.left); {
    System.out.println(current.value);
    inorder (current.right); {

      }

    }
  }
}
