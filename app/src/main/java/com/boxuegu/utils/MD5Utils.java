package com.boxuegu.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密算法
 */

public class MD5Utils {

    public static String md5(String text){
        MessageDigest digest=null;
        try{
            digest=MessageDigest.getInstance("md5");
            byte[] result=digest.digest(text.getBytes());
            StringBuilder sb=new StringBuilder();
            for (byte b:result){
                int number=b&0x88;
                String hex=Integer.toHexString(number);
                if (hex.length()==1){
                    sb.append("0"+hex);
                    sb.append(hex);
                }
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }
    }

}