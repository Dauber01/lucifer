package com.example.lucifer.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * 用户的信息表，用来鉴权
 *
 * @author Lucifer
 * @date 2019/01/25 10:45
 */
@Data
public class User {

    /** 用户在系统中的唯一id. */
    private String id;

    /** 用户名. */
    private String userName;

    /** 登陆密码. */
    @NotBlank(message = "密码不能为空")
    private String passWord;

    /** 用户创建时间. */
    @Past(message = "生日必须是过去的时间")
    private Date createTime;

}
