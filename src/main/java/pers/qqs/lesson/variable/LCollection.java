package pers.qqs.lesson.variable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qqs on 17/12/7.
 */
public class LCollection {


    public static void main(String[] args) {

        try {
            Thread.sleep(100);
            Map map = Collections.synchronizedMap(new HashMap());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
