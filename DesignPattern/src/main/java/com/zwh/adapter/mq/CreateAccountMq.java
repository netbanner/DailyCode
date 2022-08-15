package com.zwh.adapter.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author zwh
 * @date 2022年08月15日 15:28
 */
@Data
public class CreateAccountMq {

    private String number;

    private String address;

    private Date accountDate;

    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
