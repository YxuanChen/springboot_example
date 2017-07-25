package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.pojo.YxPropertity;

/**
 * Created by cindy on 17-7-25.
 */

@RestController
@RequestMapping("/controller")
public class Step1 {

    @Autowired
    private YxPropertity yxPropertity;

    @Value("${yx.name}")
    private String name;

    @Value("${yx.age}")
    private int age;

    @GetMapping("/one")
    public String one(){
        return "one";
    }

    @GetMapping("/two/{id}")
    public String two(@PathVariable String id){
        return id+":\n name:"+name+"\n age:"+age;
    }

    @GetMapping("/three/getYxPropertity")
    public YxPropertity getYxPropertity(){
        return yxPropertity;
    }

}
