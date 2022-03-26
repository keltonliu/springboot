package com.webdemo.controller;

import org.springframework.web.bind.annotation.*;

//Rest模式
@RestController
public class BookConctroller {
    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET )
    @ResponseBody
    public String getById(@PathVariable int id){
    System.out.println("查询指定用户信息：id="+id);
    return "{'module':'user getById()'}";
}
    @RequestMapping(value = "/books",method = RequestMethod.GET )
    @ResponseBody
    public String getAll(){
        System.out.println("查询所有用户信息");
        return "users";
    }
    @RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE )
    @ResponseBody
    public String delete(@PathVariable int id){
        System.out.println("删除指定用户信息：id="+id);
        return "{'module':'user delete()'}";
    }
    @RequestMapping(value = "/books",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("保存图书信息");
        return "{'module':'books save()'}";
    }
    @RequestMapping(value = "/books",method = RequestMethod.PUT )
    @ResponseBody
    public String update(){
        System.out.println("修改图书信息");
        return "{'module':'books update()'}";
    }
}
