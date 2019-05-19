package com.along.blog.dto.home.login.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author huanglong
 * @date 2019-05-19
 */
@Data
@Builder
@ApiModel("LoginReq[登陆请求类]")
public class LoginReq {

    @Pattern( regexp= "^(13|14|15|16|17|18|19)[0-9]{9}$" , message = "请输入正确的手机号格式")
    @ApiModelProperty(value="手机号码")
    private String mobile ;

    @NotNull( message = "密码不能为空")
    @ApiModelProperty( value = "密码")
    private String password ;



}
