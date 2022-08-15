package com.zwh.bridge;

import com.zwh.bridge.paymode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author zwh
 * @date 2022年08月16日 07:47
 */
@Slf4j
public abstract class Pay {

    protected IPayMode payMode;


    public Pay(IPayMode payMode){
        this.payMode = payMode;
    }


    public abstract  String transfer(String uId, String tradeId, BigDecimal amount);
}
