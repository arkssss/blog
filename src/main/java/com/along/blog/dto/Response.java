package com.along.blog.dto;

import com.along.blog.common.exception.BizException;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author along
 * @date  2019-5-15
 */

@Data
@Builder
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -4714820258897775115L;

    /**
     * 状态码
     */
    private Integer code ;

    /**
     * 提示信息
     */
    private String msg ;

    /**
     * 各个接口返回的数据
     */
    private T body ;

    /**
     * 请求成功 ：分为有返回数据的没有返回数据的
     */
    public static Response ok( Object body ){
        return Response.builder()
                .code( HttpServletResponse.SC_OK )
                .msg( HttpStatus.OK.getReasonPhrase() )
                .body( body )
                .build() ;
    }

    public static Response ok(){
        return Response.builder()
                .code( HttpServletResponse.SC_OK )
                .msg( HttpStatus.OK.getReasonPhrase() )
                .build() ;
    }

    /**
     * 请求失败
     */
    public static Response error( String msg ){
        return Response.builder()
                .code( HttpServletResponse.SC_INTERNAL_SERVER_ERROR)
                .msg( msg )
                .build() ;
    }

    public static Response error( Integer code , String msg ) {
        return Response.builder()
                .code( code )
                .msg( msg )
                .build() ;
    }

    public static Response error(BizException e){
        return Response.builder()
                .code( e.getCode() )
                .msg( e.getMessage() )
                .build() ;
    }

    /**
     * 根据flag，返回对应的消息
     *
     * @param error   失败消息
     * @param success 成功消息
     * @param flag    用于成功或失败
     * @param body    返回数据
     * @return Response
     */
    public static Response okOrError(BaseResponseStatus error, BaseResponseStatus success, boolean flag, Object... body) {
        if (flag) {
            return Response.builder()
                    .msg(success.getMsg())
                    .body(body)
                    .code( HttpServletResponse.SC_OK)
                    .build();
        }
        return Response.builder()
                .msg(error.getMsg())
                .body(body)
                .code(error.getCode())
                .build();
    }

}
