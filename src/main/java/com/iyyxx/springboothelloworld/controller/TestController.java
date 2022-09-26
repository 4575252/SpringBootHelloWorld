package com.iyyxx.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @className: TestController
 * @description: TODO 类描述
 * @author: eric 4575252@gmail.com
 * @date: 2022/9/21/0021 9:19:36
 **/
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        Integer count = (Integer)request.getSession().getAttribute("count");
        if(count!=null){
            count+=1;
        }else{
            count = 1;
        }
        request.getSession().setAttribute("count", count);

        //获取服务端IP
        String IP = null;
        try {
            IP = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        //获取客户端IP
        String clientIP = request.getRemoteHost();

        String message = "hello world! server: "+IP+", client: "+ clientIP+", count:"+ count;
        System.out.println(message);
        return message;
    }
}