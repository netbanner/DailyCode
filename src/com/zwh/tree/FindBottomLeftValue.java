package com.zwh.tree;

/**
 * @author zwh
 * @date 2022年06月22日 2:41 PM
 */
public class FindBottomLeftValue {

    int curVal = 0;
    int curHeight = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return curVal;
    }

    /*
     *
     * @desc 深度遍历树
     * @date 2022/6/22 2:41 PM
     * @param root
     * @param height
     */
    private void dfs(TreeNode root,int height){
        if(root == null){
            return;
        }
        height++;
        dfs(root.left,height);
        System.out.println(root.val);
        dfs(root.right,height);
        if(height>curHeight){
            curHeight = height;
            curVal = root.val;
        }
    }
}
