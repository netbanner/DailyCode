package com.zwh.adapter.service.adapter;

import com.zwh.adapter.service.OrderService;

/**
 * @author zwh
 * @date 2022年08月15日 16:07
 */
public class InsideOrderService  implements OrderAdapterService{


    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId)<1;
    }
}
