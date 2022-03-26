package com.webdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.webdemo.mapper.BrandMapper;
import com.webdemo.pojo.Brand;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Rest模式
@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandMapper brandMapper;
    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println("查询指定用户信息：id="+id);
        Brand brand=brandMapper.selectByIdBrand(id);

        String str = JSON.toJSONString(brand);//将json对象转换为字符串
        System.out.println(brand);
        return str;
    }
    @GetMapping
    public String getAll(){
        System.out.println("查询所有用户信息");
        List<Brand> brandList=brandMapper.selectAll();
        System.out.println(brandList);
        return "brandList";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        System.out.println("删除指定用户信息：id="+id);

        return "{'module':'user delete()'}";
    }

    @PostMapping()
    public String save(){
        System.out.println("保存图书信息");
        return "{'module':'books save()'}";
    }
    @PutMapping()
    public String update(){
        System.out.println("修改图书信息");
        return "{'module':'books update()'}";
    }
}
