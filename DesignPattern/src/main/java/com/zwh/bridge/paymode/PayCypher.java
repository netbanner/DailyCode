package com.zwh.bridge.paymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwh
 * @date 2022年08月16日 07:45
 */
@Slf4j
public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {

        log.info("密码支付，风控校验环境安全");
        return false;
    }
}
