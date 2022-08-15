package com.zwh.adapter.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author zwh
 * @date 2022年08月15日 15:39
 * @desc 统一消息mq
 */

@Data
public class RebateInfo {

    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }
}
