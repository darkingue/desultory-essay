package pers.qqs.unitils.demo;

import pers.qqs.unitils.demo.model.User;
import org.testng.annotations.Test;

import static org.unitils.reflectionassert.ReflectionAssert.*;

/**
 * Created by qqs on 17/5/26.
 */
public class AssertReflectionTest {

    @Test
    public void testAssertReflectionEquals() {
        User user1 = new User("tom", "1234@qq.com");
        User user2 = new User("tom", "1234@qq.com");
        assertReflectionEquals(user1, user2);

    }

    @Test
    public void testAssertLenientEquals() {

        Integer orderList1[] = new Integer[] { 1, 2, 3 };
        Integer orderList2[] = new Integer[] { 3, 2, 1 };

        //① 测试两个数组的值是否相等，忽略顺序
        //assertReflectionEquals(orderList1, orderList2,LENIENT_ORDER);
        assertLenientEquals(orderList1, orderList2);

    }

    @Test
    public void testAssertPropertyLenientEquals() {
        User user = new User("tom", "1234@qq.com");
        assertPropertyReflectionEquals("name", "tom", user);
        assertPropertyLenientEquals("id", null, user);

    }



}