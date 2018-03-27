package pers.qqs.testng.demo;

import pers.qqs.unitils.demo.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by qqs on 17/6/1.
 */
public class TestngTimeoutTest {

    private static User user;

    @BeforeTest
    public void init() {
        user = new User("tom", "1234@qq.com");

    }

    @Test(timeOut = 1000)
    public void testUser() {
        Assert.assertNotNull(user);
        Assert.assertEquals("tom", user.getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
