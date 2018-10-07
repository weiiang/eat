package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void testFindOne(){
        ProductCategory category = productCategoryRepository.findOne(1);
        System.out.println(category.toString());
    }

    @Test
    public void testSave(){
        ProductCategory category = new ProductCategory();
        category.setCategoryName("女生最爱的");
        category.setCategoryType(3);
        productCategoryRepository.save(category);
    }

    @Test
    public void testUpdate(){
        ProductCategory category = new ProductCategory();
        category.setCategoryId(1);
        category.setCategoryName("女生最爱的1");
        category.setCategoryType(2);
        productCategoryRepository.save(category);
    }

    @Test
    public void testFindList(){
       List<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(3);
       List<ProductCategory> l = productCategoryRepository.findByCategoryTypeIn(list);
        System.out.println(l.toString());
    }
}