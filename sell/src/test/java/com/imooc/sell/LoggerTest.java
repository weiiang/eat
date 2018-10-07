package com.imooc.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {
    private Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        logger.debug("name:{},password:{},level:{}", 123, 31231,"debug");
        logger.info("name:{},password:{},level:{}", 123, 31231,"info");
        logger.error("name:{},password:{},level:{}", 123, 31231,"error");
    }
}
