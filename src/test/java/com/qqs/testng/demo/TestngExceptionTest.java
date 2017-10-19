package com.qqs.testng.demo;

import com.qqs.unitils.demo.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by qqs on 17/5/27. 代码清单16 2  异常测试
 */
public class TestngExceptionTest {
    private User user;

    @BeforeTest
    public void init() {
        user = null;
    }

    //预期抛出空指针异常
    @Test(expectedExceptions = NullPointerException.class)
    public void testUser() {
        Assert.assertNotNull(user.getName());
    }
}
