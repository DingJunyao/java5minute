package com.qingguatang.java5minute.course1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

/**
 * ClassName: com.qingguatang.java5minute.course1.HelloWorld
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-09 19:21
 **/
@Controller
public class HelloWorld {
    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        String message = "Hello";
        return message;
    }
}
