package com.example.demo.entity;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by cindy on 17-7-26.
 */
//@Setter
//@Getter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private String tel;

    private String nickName;

    @Max(value = 999999,message = "超过最大数值")
    @Min(value = 000000,message = "密码设定不正确")
    private String passWord;

}
