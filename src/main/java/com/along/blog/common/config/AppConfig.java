package com.along.blog.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@PropertySource( value="classpath:/config/app.properties" , encoding = "UTF-8")
@Data
public class AppConfig {

    /**
     * app名称
     */
    private String name ;

    /**
     * app版本
     */
    private String version ;


}
