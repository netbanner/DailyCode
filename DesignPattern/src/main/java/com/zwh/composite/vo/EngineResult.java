package com.zwh.composite.vo;

import lombok.Data;

/**
 * @author zwh
 * @date 2022年08月18日 10:46
 */
@Data
public class EngineResult {


    private boolean isSuccess;

    private String userId;

    private Long treeId;

    private Long nodeId;

    private String nodeValue;

    public EngineResult(){

    }

    public EngineResult(boolean isSuccess){
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId,Long treeId,Long nodeId,String nodeValue){
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }



}
