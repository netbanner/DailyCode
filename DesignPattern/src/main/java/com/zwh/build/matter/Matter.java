package com.zwh.build.matter;

import java.math.BigDecimal;

/**
 * @author zwh
 * @date 2022年06月25日 4:09 PM
 */
public interface Matter {

    String scene();      // 场景；地板、地砖、涂料、吊顶

    String brand();      // 品牌

    String model();      // 型号

    BigDecimal price();  // 价格

    String desc();       // 描述

}

