package com.along.blog.common.utils;

import cn.hutool.core.codec.Base64Decoder;
import cn.hutool.core.io.IoUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

@Slf4j
public class FileUtils {

    /**
     * base64转为文件流
     */
    public static InputStream baseToInputStream( String base64String ){

        try {
            byte[] bytes = Base64Decoder.decode( base64String );
            return IoUtil.toStream( bytes ) ;
        } catch (Exception e) {
            log.info("base64转文件流异常：" , e );
        }
        return null ;
    }

}
