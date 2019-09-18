package com.leyou.controller;

import com.leyou.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController  //代替了@Controller和 @ResponseBody
/*
@EnableConfigurationProperties(User.class)
*/
@Slf4j
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private User user;

    @GetMapping("/hello")
    public String hello(){
        log.info(user.getName());
        return "hello spring boot"+user.getAge();
    }


    @GetMapping("/hello1")
    public String hello1(){
        log.info(user.getName());
        return "hello spring boot"+user.getAge();
    }
}
