package com.zwh.bridge.paymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zwh
 * @date 2022年08月16日 07:43
 */
@Slf4j
public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String uId) {

        log.info("人脸支付，风控校验脸部识别");
        return false;
    }
}
