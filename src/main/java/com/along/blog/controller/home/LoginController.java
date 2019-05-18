package com.along.blog.controller.home;


import com.along.blog.dto.Response;
import com.along.blog.dto.root.req.LoginReq;
import com.along.blog.dto.root.resp.LoginRespBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/Admin/LoginController")
@Api(tags = {"后台login控制器"})
public class LoginController {

    @PostMapping("/login")
    @ApiOperation("后台登陆")
    public Response<LoginRespBody> login(@RequestBody @Valid LoginReq req ){

        LoginRespBody loginResp = LoginRespBody.builder()
                                 .id( 10 )
                                 .age( 20 )
                                 .birthday( new Date() )
                                 .sex("男")
                                 .tel("13387599362")
                                 .username("along")
                                 .build() ;
        return Response.ok( loginResp ) ;


    }
}
