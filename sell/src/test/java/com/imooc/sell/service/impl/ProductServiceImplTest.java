package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        System.out.println(productService.findOne("123"));
    }

    @Test
    public void findUpAll() {
        System.out.println(productService.findUpAll());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> page = productService.findAll(pageRequest);
        System.out.println(page.toString());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(3);
        productInfo.setCreateTime(new Date());
        productInfo.setProductDescription("111sada的撒");
        productInfo.setProductIcon("http://www.baidu.com");
        productInfo.setProductId("1234");
        productInfo.setProductName("皮蛋瘦肉粥123");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setProductStock(1010);

        productService.save(productInfo);

    }
}