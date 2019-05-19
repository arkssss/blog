package com.along.blog.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Redis常用方法
 *
 * @author huanglong
 * @date 2019-05-19
 */
public class RedisTemplate {


    @Autowired
    private org.springframework.data.redis.core.RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate ;

    /**
     * 最简单，设置值
     */
    public void set( String key , String value ){
        redisTemplate.opsForValue().set( key ,value );
    }

    /**
     * 设置值，加上超时时间
     */
    public void set( String key , String value , Integer timeout ){
        redisTemplate.opsForValue().set( key, value , timeout , TimeUnit.SECONDS ) ;
    }

    /**
     * 获取值
     */
    public String get(  String key ){
        return redisTemplate.opsForValue().get( key ).toString() ;
    }

    /**
     * 获取一个键的过期时间
     */
    public Long getExpire( String key ){
        return redisTemplate.getExpire( key , TimeUnit.SECONDS ) ;
    }

    /**
     * 检查key是否存在
     */
    public boolean hasKey( String key ){
        return redisTemplate.hasKey( key ) ;
    }

}

