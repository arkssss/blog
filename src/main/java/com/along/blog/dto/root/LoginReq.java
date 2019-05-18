package com.along.blog.dto.root;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ApiModel("LoginReq[登陆请求类]")
public class LoginReq {

    @NotNull( message = "用户名不能为空")
    @ApiModelProperty(value="用户名" ,example = "along")
    private String username ;

    @NotNull( message = "密码不能为空")
    @ApiModelProperty(value = "密码" , example = "123456")
    private String password ;

}
