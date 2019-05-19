package com.along.blog.dto.home.login.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author huanglong
 * @date 2019-05-19
 */
@Data
@Builder
@ApiModel("SendCodeRespBody[请求发送验证码响应类]")
public class SendCodeRespBody {

    @ApiModelProperty(value="手机验证码")
    private String mobileCode ;
    
}
