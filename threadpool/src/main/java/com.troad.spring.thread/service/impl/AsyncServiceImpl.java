package com.troad.spring.thread.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.troad.spring.thread.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
 * AsyncServiceImpl.
 *
 * @date: 2019-09-30
 * @version: 1.0
 * @author: tianbo@beyondsoft.com
 */
@Service
@Slf4j
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
        log.info("start executeAsync");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("end executeAsync");
    }
}
