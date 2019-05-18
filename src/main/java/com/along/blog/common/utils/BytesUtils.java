package com.along.blog.common.utils;

public class BytesUtils {


    /**
     * byte数组转为十六进制的字符串。
     * @param src
     * @return
     */
    public static String bytesToHexString( byte[] src ){

        StringBuffer stringbuffer = new StringBuffer("") ;
        if( src == null || src.length <=0  ){
            return null ;
        }

        for (int i = 0; i < src.length ; i++) {
            int v = src[i] & 0xFF ;
            String hv = Integer.toHexString( v ) ;
            if( hv.length() < 2 ){
                stringbuffer.append( 0 ) ;
            }
            stringbuffer.append( hv ) ;
        }
        return stringbuffer.toString() ;
    }


    /**
     * 十六进制转为2进制byte
     * @param hexString
     * @return
     */
    public static byte[] hexStringToBytes( String hexString ){
        if( hexString == null || hexString.equals("") ){
            return null ;
        }

        hexString = hexString.toUpperCase() ;
        int length = hexString.length() / 2 ;
        char[] hexChars = hexString.toCharArray() ;
        byte[] d = new byte[length] ;

        for (int i = 0; i < length ; i++) {
            int pos = i * 2 ;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d ;
    }

    /**
     * char转为byte
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }


}
