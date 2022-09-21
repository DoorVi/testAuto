package com.testauto.testauto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: dorvi
 * @Date: 2022/9/21
 * @Theme:
 **/
@RestController
public class Test {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World1!";
    }
}
