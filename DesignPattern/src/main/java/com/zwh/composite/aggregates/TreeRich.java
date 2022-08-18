package com.zwh.composite.aggregates;

import com.zwh.composite.vo.TreeNode;
import com.zwh.composite.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 10:08
 * @desc 决策树
 */
@Data
public class TreeRich {

    private TreeRoot treeRoot;

    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot, Map<Long,TreeNode> treeNodeMap){
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }


}
