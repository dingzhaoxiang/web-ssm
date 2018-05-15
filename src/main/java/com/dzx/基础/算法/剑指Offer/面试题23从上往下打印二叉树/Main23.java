package com.dzx.基础.算法.剑指Offer.面试题23从上往下打印二叉树;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2017/6/30.
 */

//二叉树层序遍历
public class Main23 {
    public void LevelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null) return;
        queue.add(root);
        while(queue.size()>0){
            TreeNode t = queue.poll();
            System.out.println(t.val);
            if(t.left!=null) queue.add(t.left);
            if (t.right!=null) queue.add(t.right);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        levelOrder(root,0,levels);
        return levels;
    }
    public void levelOrder(TreeNode node,int level,List<List<Integer>> levels){
        if(node==null) return;
        if(levels.size()==level) levels.add(new ArrayList<Integer>());
        levels.get(level++).add(node.val);
        levelOrder(node.left,level,levels);
        levelOrder(node.right,level,levels);
    }
}

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
    }

}