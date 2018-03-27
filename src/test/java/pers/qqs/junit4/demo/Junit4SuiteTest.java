package pers.qqs.junit4.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by qqs on 17/6/1.
 */
@RunWith(Suite.class) //①指定Suite测试运行器
@Suite.SuiteClasses({ Junit4TimeoutTest.class, Junit4ExceptionTest.class })  //②指定要运行测试用例

public class Junit4SuiteTest {

}
