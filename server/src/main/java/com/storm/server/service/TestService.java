package com.storm.server.service;

import com.storm.server.domain.Test;
import com.storm.server.domain.TestExample;
import com.storm.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ckf48
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo(1);
        return testMapper.selectByExample(null);
    }
}
