package com.zwh.composite.service.engine;

import com.zwh.composite.aggregates.TreeRich;
import com.zwh.composite.vo.EngineResult;
import com.zwh.composite.vo.TreeNode;

import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 15:38
 */
public class TreeEngine  extends EngineBase{
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRick, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRick,treeId,userId,decisionMatter);

        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
