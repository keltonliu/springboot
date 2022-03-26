package com.webdemo;

import com.webdemo.mapper.BrandMapper;
import com.webdemo.pojo.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebDemoApplicationTests {
   //1.注册你要测试的对象
    @Autowired
    private BrandMapper brandMapper;

    @Test
    void contextLoads() {
     //2.执行你要测试对象的方法
        List<Brand> brands=brandMapper.selectAll();
        System.out.println(brands);
    }
}
