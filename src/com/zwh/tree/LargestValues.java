package com.zwh.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwh
 * @date 2022年06月24日 11:07 AM
 *
 * 515. 在每个树行中找最大值
 */
public class LargestValues {


    public List<Integer> largestValues(TreeNode root){
        List<Integer> result = new ArrayList<>();
        dfs(result,0,root);
        return  result;
    }

    private void dfs(List<Integer> result,int curHeight,TreeNode root){
        //每层的高度
        if(curHeight==result.size()){
            result.add(root.val);
        }else {
            result.set(curHeight,Math.max(result.get(curHeight),root.val));
            System.out.println(result);
        }
        if(root.left!=null) {
            dfs(result, curHeight + 1, root.left);
        }
        if(root.right!=null) {
            dfs(result, curHeight + 1, root.right);
        }
    }
}
