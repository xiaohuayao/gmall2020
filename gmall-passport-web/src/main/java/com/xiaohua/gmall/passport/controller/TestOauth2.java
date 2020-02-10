package com.xiaohua.gmall.passport.controller;

import com.alibaba.fastjson.JSON;
import com.xiaohua.gmall.util.HttpclientUtil;
import java.util.HashMap;
import java.util.Map;

public class TestOauth2 {

    public static String getCode(){

        // 1 获得授权码
        // 3569271639
        // http://192.168.1.1:8085/vlogin

        String s1 = HttpclientUtil.doGet("https://api.weibo.com/oauth2/authorize?client_id=3569271639&response_type=code&redirect_uri=http://192.168.1.1:8085/vblogin");

        System.out.println(s1);

        // 在第一步和第二部返回回调地址之间,有一个用户操作授权的过程

        // 2 返回授权码到回调地址
        //code 26d612824320818b0419e5b767199609
        return null;
    }

    public static String getAccess_token(){
        // 3 换取access_token
        // client_secret=32964decc187d1f69e05a22c56e4dfd6
        String s3 = "https://api.weibo.com/oauth2/access_token?";//?client_id=3569271639&client_secret=32964decc187d1f69e05a22c56e4dfd6&grant_type=authorization_code&redirect_uri=http://192.168.1.1:8085/vlogin&code=ac5ce4123ec5b401abe75e61ebbff3b4";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("client_id","3569271639");
        paramMap.put("client_secret","32964decc187d1f69e05a22c56e4dfd6");
        paramMap.put("grant_type","authorization_code");
        paramMap.put("redirect_uri","http://192.168.1.1:8085/vblogin");
        paramMap.put("code","26d612824320818b0419e5b767199609");// 授权有效期内可以使用，没新生成一次授权码，说明用户对第三方数据进行重启授权，之前的access_token和授权码全部过期
        String access_token_json = HttpclientUtil.doPost(s3, paramMap);

       Map<String,String> access_map = JSON.parseObject(access_token_json,Map.class);

       System.out.println(access_map.get("access_token"));
       System.out.println(access_map.get("uid"));

        return access_map.get("access_token");
    }

    public static Map<String,String> getUser_info(){
        //2.00GhtcXH6bSYtDea447644dbYzS6PE
        //6909819468
        // 4 用access_token查询用户信息
        String s4 = "https://api.weibo.com/2/users/show.json?access_token=2.00GhtcXH6bSYtDea447644dbYzS6PE&uid=6909819468";
        String user_json = HttpclientUtil.doGet(s4);
        Map<String,String> user_map = JSON.parseObject(user_json,Map.class);

        System.out.println(user_map.get("1"));

        return user_map;
    }


    public static void main(String[] args) {

        getUser_info();

    }
}
