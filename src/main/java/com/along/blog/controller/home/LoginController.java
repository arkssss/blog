package com.along.blog.controller.home;


import com.along.blog.dto.Response;
import com.along.blog.dto.home.login.req.ChangePassReq;
import com.along.blog.dto.home.login.req.LoginReq;
import com.along.blog.dto.home.login.req.RegisterReq;
import com.along.blog.dto.home.login.req.SendCodeReq;
import com.along.blog.dto.home.login.resp.LoginRespBody;
import com.along.blog.dto.home.login.resp.SendCodeRespBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/Home/LoginController")
@Api(tags = {"前台login控制器"})
public class LoginController {



    @PostMapping("/sendMobileCode")
    @ApiOperation("发送短信")
    public Response<SendCodeRespBody> sendMobileCode(@RequestBody @Valid SendCodeReq req ){
        return Response.ok() ;
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public Response register(@RequestBody @Valid RegisterReq req ){
        return Response.ok() ;
    }

    @PostMapping("/login")
    @ApiOperation("登陆")
    public Response<LoginRespBody> login(@RequestBody @Valid LoginReq req ){

        LoginRespBody loginResp = LoginRespBody.builder()
                                 .id( 10 )
                                 .build() ;
        return Response.ok( loginResp ) ;
    }

    @PostMapping("/changePass")
    @ApiOperation("更改密码")
    public Response changePass(@RequestBody @Valid ChangePassReq req ){
        return Response.ok() ;
    }



}
