package com.zwh.adapter.service.adapter;

/**
 * @author zwh
 * @date 2022年08月15日 16:06
 *
 * 就像我们前面提到随着业务的发展，营销活动本身要修改，不能只是接了MQ就发奖励。因为此时已经拉新的越来越多了，需要做一些限制。
 *
 * 因为增加了只有首单用户才给奖励，也就是你一年或者新人或者一个月的第一单才给你奖励，而不是你之前每一次下单都给奖励。
 */
public interface OrderAdapterService {


    boolean isFirst(String uId);
}
