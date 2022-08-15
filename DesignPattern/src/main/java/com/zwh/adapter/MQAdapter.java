package com.zwh.adapter;

import com.alibaba.fastjson.JSON;
import com.zwh.adapter.mq.RebateInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年08月15日 15:40
 */
public class MQAdapter {



    /**
     *
     * @desc 根据映射关系转化为统一传输实体类
     * @date 2022/8/15 16:03
     * @param strJson
     * @param link
     * @return com.zwh.adapter.mq.RebateInfo
     */
    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }

}
