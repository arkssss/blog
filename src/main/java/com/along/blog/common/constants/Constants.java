package com.along.blog.common.constants;

public class Constants {
    private Constants() {
    }

    /**
     * 默认展示第一页数据
     */
    public static final int DEFAULT_PAGE_NUM = 1;

    /**
     * 默认一页显示10条数据
     */
    public static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 用户密码正则表达式
     */
    public static final String PAWD_PATTERN = "[a-zA-Z0-9]{6,20}";

    /**
     * 手机号正则表达式
     */
    public static final String PHONE_PATTERN = "^(13|14|15|16|17|18|19)[0-9]{9}$";

    /**
     * 图片类型.jpg
     */
    public static final String IMAGE_TYPE_JPG = ".jpg";

    /**
     * zip压缩包类型
     */
    public static final String ZIP = ".zip";
}
