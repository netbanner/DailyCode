package com.zwh.adapter;

import com.alibaba.fastjson.JSON;
import com.zwh.adapter.mq.CreateAccountMq;
import com.zwh.adapter.mq.OrderMq;
import com.zwh.adapter.mq.RebateInfo;
import com.zwh.adapter.service.adapter.InsideOrderService;
import com.zwh.adapter.service.adapter.OrderAdapterService;
import com.zwh.adapter.service.adapter.ThirdAdapterService;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;

/**
 * @author zwh
 * @date 2022年08月15日 15:44
 */
public class TestAdapter {


    @Test
    public void testMqAdapter() throws  Exception{
        CreateAccountMq createAccountMq = new CreateAccountMq();
        createAccountMq.setNumber("100001");
        createAccountMq.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        createAccountMq.setAccountDate(new Date());
        createAccountMq.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(createAccountMq.toString(), link01);
        System.out.println("mq.create_account(适配前)" + createAccountMq.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setGoodsId("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(new Date());

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);

        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }


    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new ThirdAdapterService();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }
}
