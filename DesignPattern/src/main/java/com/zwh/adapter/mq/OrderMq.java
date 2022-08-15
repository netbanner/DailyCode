package com.zwh.adapter.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author zwh
 * @date 2022年08月15日 15:32
 */

@Data
public class OrderMq {


    private String uid;

    private String goodsId;

    private String orderId;


    private Date createOrderTime;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
