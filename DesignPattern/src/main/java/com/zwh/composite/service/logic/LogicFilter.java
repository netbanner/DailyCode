package com.zwh.composite.service.logic;

import com.zwh.composite.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 10:10
 */
public interface LogicFilter {
    
    
    /**
     * 
     * @desc 逻辑决策器
     * @date 2022/8/18 10:59
     * @param matterValue
     * @param treeNodeLinkList 
     * @return java.lang.Long
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    
    /**
     * 
     * @desc 获取决策值
     * @date 2022/8/18 10:59
     * @param treeId
     * @param userId
     * @param decisionMatter 
     * @return java.lang.String
     */
    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);
}
