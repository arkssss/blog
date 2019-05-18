package com.along.blog.common.exception.handler;

import com.along.blog.common.exception.ArgumentInvalidRespBody;
import com.along.blog.common.exception.BizException;
import com.along.blog.dto.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 统一异常处理类
 */
@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    /**
     * 自定义异常
     */
    @ExceptionHandler( BizException.class )
    public Object customHandler( BizException e ){
        log.error("BizException:" + e );
        return Response.builder()
                .code( e.getCode() )
                .msg( e.getMessage() )
                .build() ;
    }

    /**
     * 授权失败异常
     */
    @ExceptionHandler(AuthenticationException.class)
    public Object customHandler( AuthenticationException e ){
        printRequestExceptionURI();
        log.error("AuthenticationException:" , e );
        return getUnauthorizedResp( e ) ;
    }

    /**
     * 授权失败异常
     */
    @ExceptionHandler(AccessDeniedException.class)
    public Object customHandler(AccessDeniedException e) {
        printRequestExceptionURI();
        log.error("AccessDeniedException: ", e);
        return getUnauthorizedResp(e);
    }

    /**
     * 其他未处理异常
     */
    @ExceptionHandler( Exception.class)
    public Object exceptionHandler( Exception e ){
        printRequestExceptionURI();
        log.error("Exception:" , e );
        return Response.builder()
                    .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .msg( e.getMessage() )
                    .build() ;
    }

    /**
     * 重新封装检验类的错误信息
     * 这里返回非法字段的名称，原始值，错误信息
     */
    @ExceptionHandler( value = {MethodArgumentNotValidException.class} )
    public Object methodArgumentNotValidHandler( MethodArgumentNotValidException e ){
        List<ArgumentInvalidRespBody> invalidArguments = new ArrayList<>();
        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            ArgumentInvalidRespBody invalidArgument = new ArgumentInvalidRespBody();
            invalidArgument.setDefaultMessage(error.getDefaultMessage());
            invalidArgument.setField(error.getField());
            invalidArgument.setRejectedValue(error.getRejectedValue());
            invalidArguments.add(invalidArgument);
        }

        return Response.builder()
                .code( HttpStatus.BAD_REQUEST.value() )
                .msg(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .body(invalidArguments)
                .build();
    }




    /**
     * 获取http的状态码，并返回错误信息
     */
    private Response getUnauthorizedResp(RuntimeException e) {
        return Response.builder()
                .code(HttpServletResponse.SC_UNAUTHORIZED)
                .msg(e.getMessage())
                .build();
    }

    /**
     * 打印错误的地址
     */
    private void printRequestExceptionURI() {
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        log.error("请求异常的URI - {}", request.getRequestURI());
    }




}
