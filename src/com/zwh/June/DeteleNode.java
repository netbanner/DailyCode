package com.zwh.June;

/**
 * @Date 2022-06-02
 */

import com.zwh.util.TreeNode;

/**
 * 根据二叉搜索树的性质
 *
 * 如果目标节点大于当前节点值，则去右子树中删除；
 * 如果目标节点小于当前节点值，则去左子树中删除；
 * 如果目标节点就是当前节点，分为以下三种情况：
 * 其无左子：其右子顶替其位置，删除了该节点；
 * 其无右子：其左子顶替其位置，删除了该节点；
 * 其左右子节点都有：其左子树转移到其右子树的最左节点的左子树上，然后右子树顶替其位置，由此删除了该节点。
 *
 */
public class DeteleNode {


    public TreeNode deleteNode(TreeNode root,int key){
        if(root==null) {
            return null;
        }
        if(root.val>key){

            root.left= deleteNode(root.left,key);
        }else if(root.val<key){

            root.right= deleteNode(root.right,key);
        }else{
            //删除为当前节点
            //情况1
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) { //情况2
                return root.left;
            } else if (root.right != null && root.left != null) { //情况3
                //右子树
                TreeNode node = root.right;
                //寻找右子树的最左节点
                while (node.left != null) {
                    node = node.left;
                }
                //将右子树的最左节点的左节点指向当前节点的左节点
                node.left = root.left;
                //欲删除节点的右子顶替其位置，节点被删除
                root = root.right;
            }

        }

        return root;
    }

}
