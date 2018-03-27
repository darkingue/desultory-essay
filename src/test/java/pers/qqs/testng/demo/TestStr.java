package pers.qqs.testng.demo;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by qqs on 17/6/13.
 */
public class TestStr {
    private static String greeting = "hello  ";

    @Test
    public void test() {
        int index = greeting.offsetByCodePoints(0, 4);
        int cp = greeting.codePointAt(4);
        int cpCount = greeting.codePointCount(0, greeting.length());

        System.out.println(index);
        System.out.println(cp);
        System.out.println(cpCount);
        System.out.println(greeting.charAt(0));
    }

    @Test
    public void toUnicode() {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < greeting.length(); i++) {
            //            char x = greeting.charAt(i);
            char x = '儿';
            System.out.println(x);
            unicode.append("\\u" + Integer.toHexString(x));
        }

        System.out.println(unicode.toString());
        System.out.println(System.getProperty("file.encoding"));

        System.out.println(Integer.toHexString('汉'));

        String a = "汉";

    }

    @Test
    public void testFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/qqs/GitHub/hz-qa-autotest/qqs.log");
            fileOutputStream.write("汉".getBytes());

            FileInputStream fis = new FileInputStream("/Users/qqs/GitHub/hz-qa-autotest/qqs.log");

            byte[] b = new byte[fis.available()];//创建一个字节数组，数组长度与file中获得的字节数相等
            while (fis.read(b) != -1) {
                String st = new String(b, "utf-8");
                System.out.println(st);//打印出从file文件读取的内容
                System.out.format("%x\n", (short) st.charAt(0));
                int code = st.codePointAt(st.offsetByCodePoints(0, 0));
                System.out.println(code);
                for (int i = 0; i < b.length; i++) {
                    //                    UTF-8 0xE6B189
                    System.out.format("%x", (short) b[i]);
                }
                System.out.println();
                System.out.format("%x\n", (short) code);
                System.out.println(String.valueOf(Character.toChars(code)));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void charToString() {
        String s = String.valueOf(Character.toChars(0x2F81A));
        System.out.println(s);
        char[] chars = s.toCharArray();
        for (char c : chars) {
            System.out.format("%x", (short) c);

        }

    }
}


