package com.zwh.adapter.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwh
 * @date 2022年08月15日 15:36
 */

@Slf4j
public class OrderService {

    public long queryUserOrderCount(String userId){
        log.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }


}
