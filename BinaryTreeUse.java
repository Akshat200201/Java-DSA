import java.util.Scanner;

public class BinaryTreeUse {

    public static void printTree (BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }
        String toBePrinted = root.data + " ";
        if (root.left != null){
            toBePrinted += "l" + root.left.data + ",";
        }
        if (root.right != null){
            toBePrinted += "R" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }


    public static BinaryTreeNode<Integer> takeinput(Scanner s){
        int rootData;
        System.out.println("enter root data");
        rootData = s.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeinput(s);
        root.right = takeinput(s);
        return root;
    }


    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeinput(s);
        printTree(root);
        s.close();



        //        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1  = new BinaryTreeNode<>(2);
//        root.left = node1;
//        BinaryTreeNode<Integer> node2  = new BinaryTreeNode<>(3);
//        root.right = node2;
//


    }
}
