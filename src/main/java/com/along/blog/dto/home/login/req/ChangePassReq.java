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
@ApiModel(value = "修改密码请求类[ChangePassReq]")
public class ChangePassReq {

    @Pattern( regexp= "^(13|14|15|16|17|18|19)[0-9]{9}$" , message = "请输入正确的手机号格式")
    @ApiModelProperty(value = "手机号码")
    private String mobile ;

    @NotNull( message = "手机验证码不能为空")
    @ApiModelProperty(value = "手机验证码")
    private String mobileCode ;

}
