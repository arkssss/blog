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
@ApiModel("LoginRespBody[注册响应类]")
public class LoginRespBody {

    @ApiModelProperty( value = "用户id" )
    private Integer id ;

    @ApiModelProperty( value = "用户昵称")
    private String username ;

    @ApiModelProperty( value = "头像")
    private String avatar ;

    @ApiModelProperty( value = "电话号码")
    private String mobile ;

    @ApiModelProperty( value = "用户状态")
    private Integer status ;

}
