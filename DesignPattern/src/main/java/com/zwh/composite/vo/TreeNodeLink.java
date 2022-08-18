package com.zwh.composite.vo;

import lombok.Data;

/**
 * @author zwh
 * @date 2022年08月18日 10:43
 * @desc 规则树线信息
 */
@Data
public class TreeNodeLink {


    private Long nodeIdFrom;        //节点From

    private Long nodeIdTo;          //节点To

    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]

    private String ruleLimitValue;  //限定值

}
