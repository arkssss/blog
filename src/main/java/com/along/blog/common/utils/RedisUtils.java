//package com.along.blog.common.utils;
//
//import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * redis工具了类：最原始的jedis
// * 需要引入
// *  <dependency>
// *             <groupId>org.springframework.data</groupId>
// *             <artifactId>spring-data-redis</artifactId>
// *             <version>2.0.8.RELEASE</version>
// *  </dependency>
// *  <dependency>
// *             <groupId>com.yugabyte</groupId>
// *             <artifactId>jedis</artifactId>
// *             <version>2.9.0-yb-11</version>
// *  </dependency>
// *
// * @author huanglong
// * @date 2019-05-19
// */
//public class RedisUtils {
//    /**
//     * 获取jedis
//     * @return
//     */
//    public static Jedis getJedis(){
//        Jedis jedis = new Jedis("127.0.0.1" , 6379 , 1000 ) ;
//        jedis.select( 3 ) ;
//        //jedis.auth() ;
//        jedis.flushDB() ;
//        return jedis ;
//    }
//
//    /**
//     * 从连接池中获取到jedis
//     */
//    public static Jedis getJedisFromPool(){
//        GenericObjectPoolConfig config = new JedisPoolConfig() ;
//        config.setMaxTotal( 100 );     //设置连接池最多允许放100个Jedis对象
//        //我的建议maxidle与maxTotal一样
//        config.setMaxIdle(100);//设置连接池中最大允许的空闲连接
//        config.setMinIdle(10);//设置连接池中最小允许的连接数
//        config.setTestOnBorrow(false); //借出连接的时候是否测试有效性,推荐false
//        config.setTestOnReturn(false); //归还时是否测试,推荐false
//        config.setTestOnCreate(true); //创建时是否测试有效
//        config.setBlockWhenExhausted(true);//当连接池内jedis无可用资源时,是否等待资源 ,true
//        config.setMaxWaitMillis(1000); //没有获取资源时最长等待1秒,1秒后还没有的话就报错
//        //创建jedis,这句话运行后就自动根据上面的配置来初始化jedis资源了
//        JedisPool pool = new JedisPool(config , "127.0.0.1" , 6379 );
//
//        Jedis jedis = null ;
//        jedis = pool.getResource(); //从连接池中"借出(borrow)"一个jedis对象
//        //jedis.auth("123456");
//
//        return jedis ;
//
//    }
//
//
//}
