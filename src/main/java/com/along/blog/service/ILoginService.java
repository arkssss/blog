package com.along.blog.service;

/**
 * @author huanglong
 * @date 2019-05-19
 */

public interface ILoginService {
    /**
     * 发送短信
     */
    public String sendMobileCode( String mobile ) ;

}
