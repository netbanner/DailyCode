package com.zwh.bridge;

import com.zwh.bridge.paymode.PayFaceMode;
import com.zwh.bridge.paymode.PayFingerprintMode;
import com.zwh.bridge.paymode.WxPay;
import com.zwh.bridge.paymode.ZfbPay;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author zwh
 * @date 2022年08月16日 07:52
 */
public class TestBridge {


    @Test
    public void testPay(){
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }


}
