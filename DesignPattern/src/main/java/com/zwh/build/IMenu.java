package com.zwh.build;

import com.zwh.build.matter.Matter;

/**
 * @author zwh
 * @date 2022年06月25日 4:09 PM
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细

}

