package com.imooc.sell.controller;

import com.imooc.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {


    @RequestMapping("/list")
    public ResultVO list(){
        return null;
    }
}
