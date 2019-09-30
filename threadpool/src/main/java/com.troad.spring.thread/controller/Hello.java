package com.troad.spring.thread.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.troad.spring.thread.service.AsyncService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello.
 *
 * @date: 2019-09-30
 * @version: 1.0
 * @author: tianbo@beyondsoft.com
 */
@RestController
@Slf4j
public class Hello {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String submit(){
        log.info("start submit");

        //调用service层的任务
        asyncService.executeAsync();

        log.info("end submit");

        return "success";
    }
}
