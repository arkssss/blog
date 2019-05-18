package com.along.blog.common.exception;


import lombok.Getter;
import lombok.Setter;

/**
 * 基本异常处理类
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 2908865859860576687L;

    private Integer code;

    public BizException(Integer code , String msg ){
        super( msg ) ;
        this.code = code ;
    }

}
