package com.along.blog.dto.root.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@ApiModel("LoginRespBody[登陆请求响应类]")
public class LoginRespBody {

    @ApiModelProperty( value = "用户id")
    private Integer id ;

    @ApiModelProperty( value = "用户名")
    private String username ;

    @ApiModelProperty( value = "性别")
    private String sex;

    @ApiModelProperty( value = "年龄")
    private Integer age ;

    @ApiModelProperty( value = "电话")
    private String tel ;

    @ApiModelProperty( value = "生日" )
    private Date birthday ;

}
