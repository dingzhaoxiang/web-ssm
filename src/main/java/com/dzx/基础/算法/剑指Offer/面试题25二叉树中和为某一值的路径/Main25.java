package com.dzx.基础.算法.剑指Offer.面试题25二叉树中和为某一值的路径;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Main25 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        path(root,target,res,path);
        return res;
    }

    public void path(TreeNode root, int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> path){
       if(root!=null){
           path.add(root.val);
           target = target - root.val;
           if(target==0&&root.left==null&&root.right==null){
               res.add(new ArrayList<Integer>(path));
           }
           path(root.left,target,res,path);
           path(root.right,target,res,path);
           path.remove(path.size()-1);
       }
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
