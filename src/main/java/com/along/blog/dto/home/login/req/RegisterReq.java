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
@ApiModel("RegisterReq[注册请求类]")
public class RegisterReq {

    @Pattern( regexp= "^(13|14|15|16|17|18|19)[0-9]{9}$" , message = "请输入正确的手机号格式")
    @ApiModelProperty( value="手机号码")
    private String tel ;

    @NotNull( message = "请输入用户名" )
    @ApiModelProperty( value = "用户名" )
    private String username ;

    @NotNull( message = "请输入密码")
    @ApiModelProperty( value = "密码" )
    private String password ;

    @NotNull( message = "请输入手机验证码" )
    private String mobileCode ;

}
