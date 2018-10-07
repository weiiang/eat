package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void testFindOne(){
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }
    @Test
    public void testFindAll(){
        List<ProductCategory> productCategory = categoryService.findAll();
        Assert.assertNotEquals(0, productCategory.size());
    }

    @Test
    public void testCategoryTypeIn(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        List<ProductCategory> productCategory = categoryService.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, productCategory.size());
    }

    @Test
    public void testSave(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(22);
        productCategory.setCategoryName("男生最爱");
        ProductCategory productCategory1 = categoryService.save(productCategory);
        Assert.assertNotNull(productCategory1);

    }

}