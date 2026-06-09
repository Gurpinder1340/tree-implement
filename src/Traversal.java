import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    levelOrder(root);
    //preorderIterative(root);
    // preorder(megaRoot);
    // preorder(stringRoot);
    // postorder(root);
    // inorder(root);
    // printGreaterThan(root, 1);
    // System.out.println(countNodes(root));

  
  
   TreeNode<String> stringRoot = new TreeNode<>("Hello");
    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("sdkjf");
    stringRoot.left.right = new TreeNode<>("sdf");

    stringRoot.right = new TreeNode<>("dfgdf");
     new TreeNode<>("dfgdf");
     new TreeNode<>("yo");
     new TreeNode<>("ey");


TreeNode<Integer> megaRoot = new TreeNode<Integer>(1);

 TreeNode<Integer> current = megaRoot;

 for (int i = 1; i < 100_001; i++) {
  current.right = new TreeNode<Integer>(i);
  current = current.right;

 }
 
}

 

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

  public static void preorderIterative(TreeNode<?> root) {
    Stack<TreeNode<?>> stack = new Stack<>();

    stack.push(root);

    while(!stack.isEmpty()) {
      TreeNode<?> current = stack.pop();
      if(current == null) continue;
      //do something
      System.out.println(current.value);
      stack.push(current.left);
      stack.push(current.right);
    }
  }


  public static void levelOrder(TreeNode<?> root){
    Queue<TreeNode<?>> queue = new LinkedList<>();

    queue.offer(root);

    while(!queue.isEmpty()) {
      TreeNode<?> current = queue.remove();
      if(current == null) continue;
      System.out.println(current.value);
      queue.offer(current.left);
      queue.offer(current.right);
    }
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

  public static void inorder(TreeNode<?> current) {
    if (current == null) return;
    inorder (current.left); 
    System.out.println(current.value);
    inorder (current.right); {

      }

    }
  }

