package com.qqs.junit4.demo;

import com.qqs.unitils.demo.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qqs on 17/5/27. 代码清单16 2  异常测试
 */
public class Junit4ExceptionTest {
    private User user;

    @Before
    public void init() {
        user = null;
    }

    //预期抛出空指针异常
    @Test(expected = NullPointerException.class)
    public void testUser() {
        Assert.assertNotNull(user.getName());
    }
}
