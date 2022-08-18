package com.zwh.composite.service.engine;

import com.zwh.composite.aggregates.TreeRich;
import com.zwh.composite.service.logic.LogicFilter;
import com.zwh.composite.vo.EngineResult;
import com.zwh.composite.vo.TreeNode;
import com.zwh.composite.vo.TreeRoot;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 15:19
 */
@Slf4j
public abstract class EngineBase extends EngineConfig implements IEngine{
    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRick, Map<String, String> decisionMatter) ;

    protected TreeNode engineDecisionMaker(TreeRich treeRick, Long treeId, String userId, Map<String,String> decisionMatter){
        TreeRoot treeRoot = treeRick.getTreeRoot();
        Map<Long,TreeNode> treeNodeMap = treeRick.getTreeNodeMap();
        //规则树根Id
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);

        //节点类型
        while (treeNodeInfo.getNodeType().equals(1)){
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId,userId,decisionMatter);
            Long nextNode = logicFilter.filter(matterValue,treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
//            log.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);

        }

        return treeNodeInfo;
    }
}
