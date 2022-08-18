package com.zwh.composite.service.logic;

import com.zwh.composite.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 11:00
 */
public class BaseLogic implements LogicFilter {


    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLink : treeNodeLinkList) {
            if(decisionLogic(matterValue,nodeLink)){
                return nodeLink.getNodeIdTo();
            }
        }

        return 0L;
    }

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return null;
    }

    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {

            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue)>Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue)<Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue)>=Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue)<=Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
