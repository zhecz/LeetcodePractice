import java.util.ArrayDeque;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class BSTIterator {
    ArrayList<Integer> nodesSorted;
    int index;

    public BSTIterator(TreeNode root){
        this.nodesSorted=new ArrayList<Integer>();
        this.inorder(root);
        index=-1;


    }

    public void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        this.nodesSorted.add(node.val);
        inorder(node.right);

    }

    public int next(){
        return this.nodesSorted.get(++index);

    }

    public boolean hasNext(){
        return this.index+1<this.nodesSorted.size();

    }





}
