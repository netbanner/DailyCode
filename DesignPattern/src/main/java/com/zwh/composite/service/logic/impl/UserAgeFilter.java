package com.zwh.composite.service.logic.impl;

import com.zwh.composite.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 14:26
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {

        return decisionMatter.get("age");
    }
}
