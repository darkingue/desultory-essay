package com.qqs.junit4.demo;

import com.qqs.unitils.demo.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by qqs on 17/6/1.
 */
public class Junit4AssertTest {
    @Test
    public void testArrayAssert() {
        String users[] = new String[] { "tom", "john", "tony" };
        assertArrayEquals(new String[] { "tom", "john", "tony" }, users);
    }

    private User tom;
    private User john;

    @Before
    public void init() {
        tom = new User("tom", "1234");
        tom.setCredits(100);
        john = new User("john", "1234");
        john.setCredits(50);
    }

    @Test
    public void testAasertThat() {
        //        //     ① 数值匹配
        //        //        测试变量的值是否大于指定值
        //        assertThat(tom.getCredits(), greaterThan(50));
        //        // 测试变量的值小于指定值时
        //        assertThat(tom.getCredits(), lessThan(150));
        //        // 测试变量的值大于等于指定值
        //        assertThat(tom.getCredits(), greaterThanOrEqualTo(100));
        //        // 测试变量的值小于等于指定值
        //        assertThat(tom.getCredits(), lessThanOrEqualTo(100));
        //
        //        // 测试所有条件必须都成立
        //        assertThat(tom.getCredits(), allOf(greaterThan(50), lessThan(150)));
        //        // 测试只要有一个条件成立
        //        assertThat(tom.getCredits(), anyOf(greaterThan(50), lessThan(200)));
        // 测试无论什么条件成立
        assertThat(tom.getCredits(), anything());
        // 测试变量的值等于指定值
        assertThat(tom.getCredits(), is(100));
        // 测试和is相反，变量的值不等于指定值
        assertThat(tom.getCredits(), not(50));

        //② 字符串匹配
        String url = "http://www.baobaotao.com";
        // 测试字符串变量中包含指定字符串
        assertThat(url, containsString("baobaotao.com"));
        // 测试字符串变量以指定字符串开头
        assertThat(url, startsWith("http://"));
        // 测试字符串变量以指定字符串结尾
        assertThat(url, endsWith(".com"));
        // 测试字符串变量等于指定字符串
        assertThat(url, equalTo("http://www.baobaotao.com"));
        // 测试字符串变量在忽略大小写的情况下等于指定字符串
        //        assertThat(url, equalToIgnoringCase("http://www.BAOBAOTAO.com"));
        //        // 测试字符串变量在忽略头尾任意空格的情况下等于指定字符串
        //        assertThat(url, equalToIgnoringWhiteSpace(" http://www.baobaotao.com "));

        //③ 集合匹配
        List<User> users = new ArrayList();
        users.add(tom);
        users.add(john);
        // 测试变量中是否含有指定元素
        assertThat(users, hasItem(tom));
        assertThat(users, hasItem(john));

        //④ Map匹配
        Map<String, User> userMap = new HashMap();
        userMap.put(tom.getName(), tom);
        userMap.put(john.getName(), john);
        // 测试Map变量中是否含有指定键值对
        //        assertThat(userMap, hasEntry(tom.getName(), tom));
        //        // 测试Map变量中是否含有指定键
        //        assertThat(userMap, hasKey(john.getName()));
        //        // 测试Map变量中是否含有指定值
        //        assertThat(userMap, hasValue(john));
    }

}
