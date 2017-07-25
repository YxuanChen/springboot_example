package com.example.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cindy on 17-7-25.
 */


@Component
@ConfigurationProperties(prefix = "yx")
public class YxPropertity {

    private String name;

    private Integer age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "yxProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
