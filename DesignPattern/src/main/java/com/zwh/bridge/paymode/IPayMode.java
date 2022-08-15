package com.zwh.bridge.paymode;

/**
 * @author zwh
 * @date 2022年08月16日 07:42
 */
public interface IPayMode {

    /*
     *
     * @desc 安全接口
     * @date 2022/8/16 07:43
     * @param uId
     * @return boolean
     */
    boolean security(String uId);
}
