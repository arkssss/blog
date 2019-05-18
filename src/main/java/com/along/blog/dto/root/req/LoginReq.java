package com.along.blog.dto.root.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author huanglong
 * @date 2019-05-15
 */
@Data
@Builder
@ApiModel("LoginReq[后台登陆请求类]")
public class LoginReq {

    @Length( min = 2 , max = 20 , message = "用户名长度需要在2到20位之间")
    @NotNull( message = "补习")
    @ApiModelProperty( value = "用户名")
    private String username ;

    @NotNull( message="密码不能为空")
    @ApiModelProperty( value = "密码")
    private String password ;

    @NotNull( message = "ggg")
    private Integer code ;

}
