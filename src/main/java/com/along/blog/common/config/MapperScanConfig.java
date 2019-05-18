package com.along.blog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 指定springboot去扫mapper的包
 */
@Configuration
@MapperScan("com.along.blog.mapper")
public class MapperScanConfig {}
