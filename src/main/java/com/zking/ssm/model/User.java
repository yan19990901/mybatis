package com.zking.ssm.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class User implements Serializable{

    public static interface ValidatedGroups{
        public static interface Reg{

        }
        public static interface Login{

        }
    }

    @NotBlank(message = "用户名不能为空",groups = {User.ValidatedGroups.Reg.class,User.ValidatedGroups.Login.class})
    @Length(min = 3,max = 10,message = "用户名必须在3~10之间",groups = {User.ValidatedGroups.Reg.class,User.ValidatedGroups.Login.class})
    private String username;

    @NotBlank(message = "密码不能为空",groups = {User.ValidatedGroups.Reg.class,User.ValidatedGroups.Login.class})
    private String password;

    @NotBlank(message = "确认密码不能为空",groups = {User.ValidatedGroups.Reg.class})
    private String password2;

}



