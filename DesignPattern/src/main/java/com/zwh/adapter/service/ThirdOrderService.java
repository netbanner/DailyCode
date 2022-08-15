package com.zwh.adapter.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwh
 * @date 2022年08月15日 15:37
 */
@Slf4j
public class ThirdOrderService {



    public boolean isFirstOrder(String goodsId){
        log.info("POP商家，查询用户的订单是否为首单：{}", goodsId);
        return true;
    }

}
