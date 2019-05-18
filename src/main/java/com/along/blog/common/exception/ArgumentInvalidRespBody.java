package com.along.blog.common.exception;

import lombok.Data;

/**
 * @author huanglong
 * @date 2019-05-15
 */
@Data
public class ArgumentInvalidRespBody {
    private String field ;
    private Object rejectedValue ;
    private String defaultMessage ;
}
