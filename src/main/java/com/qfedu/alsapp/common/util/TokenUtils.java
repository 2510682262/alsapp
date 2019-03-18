package com.qfedu.alsapp.common.util;

import com.qfedu.alsapp.entity.AUser;
import jdk.internal.dynalink.beans.StaticClass;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenUtils {

    public  static Map<String,Object> map;

    public static String create(AUser aUser){

        String uuid = UUID.randomUUID().toString().replaceAll("-","");


       map = new HashMap<>();

        map.put(uuid,aUser);
        return uuid;
    }

    public static AUser get(String uuid){

        if(!"".equals(uuid)&&null!=uuid){

            AUser aUser = null;

            try {
                aUser = (AUser) map.get(uuid);
            } catch (Exception e) {
                e.printStackTrace ();
            }

            if(aUser!=null){
                return aUser;
            }
        }
        return null;
    }


}
