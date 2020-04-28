package com.storm.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.storm.server.domain.Test;
import com.storm.server.service.TestService;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author ckf48
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public List<Test> test() {
        return testService.list();
    }
}