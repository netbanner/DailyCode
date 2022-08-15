package com.zwh.adapter.mq;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zwh
 * @date 2022年08月15日 15:34
 */
@Data
public class ThirdOrder {

    private String uId;

    private String oderId;


    private Date orderTime;

    private String goodsId;

    private String goodsName;


    private BigDecimal amount;



}
