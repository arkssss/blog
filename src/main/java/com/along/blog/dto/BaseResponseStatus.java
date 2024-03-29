package com.along.blog.dto;

/**
 * BaseResponseStatus
 *
 * @author LeiXinXin
 * @date 2019/1/3
 */
public interface BaseResponseStatus {
    /**
     * 获取消息
     *
     * @return String
     */
    String getMsg();

    /**
     * 获取编码
     *
     * @return Integer
     */
    Integer getCode();
}
