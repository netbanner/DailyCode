package com.zwh.composite.service.engine;

import com.zwh.composite.service.logic.LogicFilter;
import com.zwh.composite.service.logic.impl.UserAgeFilter;
import com.zwh.composite.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwh
 * @date 2022年08月18日 14:36
 */
public class EngineConfig {

    static Map<String, LogicFilter>   logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }

    public Map<String,LogicFilter> getLogicFilterMap(){
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String,LogicFilter> filterMap ){
        this.logicFilterMap = logicFilterMap;
    }
}
