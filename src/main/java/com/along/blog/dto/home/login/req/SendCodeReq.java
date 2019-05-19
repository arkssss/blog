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
@ApiModel("SendCodeReq[手机验证码请求类]")
public class SendCodeReq {

    @Pattern( regexp= "^(13|14|15|16|17|18|19)[0-9]{9}$" , message = "请输入正确的手机号格式")
    @ApiModelProperty(value = "手机号码")
    private String mobile ;

}
