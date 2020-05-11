package com.dh.ms;

import com.dh.ms.entity.TestDemo;
import com.dh.ms.service.ITestServcie;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MsApplicationTests {

    @Autowired
    private ITestServcie testServcie;

    @Test
    void testSave() {

        TestDemo t = new TestDemo();
        t.setName1("AAA");
        testServcie.saveTest(t);
    }

    @Test
    void testGet(){
        TestDemo test = testServcie.getTest("222");
        System.out.println(test.getName1());
    }

}
