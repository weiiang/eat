package com.imooc.sell.vo;

import lombok.Data;

@Data
public class ResultVO<T> {

    private  Integer code;
    private  String msg;
    private  T data;


    public static ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(data);
        resultVO.setMsg("操作成功!");
        return  resultVO;
    }

    public static ResultVO fail(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setData(data);
        resultVO.setMsg("操作失败!");
        return  resultVO;
    }


}
