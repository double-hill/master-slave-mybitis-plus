package com.dh.ms.service;

import com.dh.ms.entity.TestDemo;

/**
 * @author WeiC
 * @date 2020/5/11 10:37
 */
public interface ITestServcie {
    void saveTest(TestDemo test);
    TestDemo getTest(String id);
}
