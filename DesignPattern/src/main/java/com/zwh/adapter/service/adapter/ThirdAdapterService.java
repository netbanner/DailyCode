package com.zwh.adapter.service.adapter;

import com.zwh.adapter.service.ThirdOrderService;

/**
 * @author zwh
 * @date 2022年08月15日 16:08
 * @desc 第三方实现是否是首单类
 */
public class ThirdAdapterService  implements OrderAdapterService{


    private ThirdOrderService thirdOrderService = new ThirdOrderService();
    @Override
    public boolean isFirst(String uId) {
        return thirdOrderService.isFirstOrder(uId);
    }
}
