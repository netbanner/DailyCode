package com.zwh.composite.service.engine;

import com.zwh.composite.aggregates.TreeRich;
import com.zwh.composite.vo.EngineResult;

import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月18日 14:34
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRick, final Map<String,String> decisionMatter);
}
