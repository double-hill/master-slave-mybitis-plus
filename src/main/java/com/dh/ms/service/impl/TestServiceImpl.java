package com.dh.ms.service.impl;

import com.dh.ms.annotation.Master;
import com.dh.ms.annotation.Slave;
import com.dh.ms.entity.TestDemo;
import com.dh.ms.mapper.TestMapper;
import com.dh.ms.service.ITestServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WeiC
 * @date 2020/5/11 10:37
 */
@Service
public class TestServiceImpl implements ITestServcie {
    @Autowired
    private TestMapper testMapper;

    @Override
    @Master
    public void saveTest(TestDemo test) {
        testMapper.insert(test);
    }

    @Override
    @Slave
    public TestDemo getTest(String id) {
        return testMapper.selectById(id);
    }
}
