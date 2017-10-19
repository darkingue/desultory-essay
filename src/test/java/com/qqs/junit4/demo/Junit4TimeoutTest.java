package com.qqs.junit4.demo;

import com.qqs.unitils.demo.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by qqs on 17/6/1.
 */
public class Junit4TimeoutTest {

    private static User user;

    @Before
    public void init() {
        user = new User("tom", "1234@qq.com");

    }

    @Test(timeout = 1000)
    public void testUser() throws InterruptedException {
        Assert.assertNotNull(user);
        Assert.assertEquals("tom", user.getName());
        Thread.sleep(1000);
    }
}
