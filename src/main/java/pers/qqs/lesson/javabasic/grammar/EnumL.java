package pers.qqs.lesson.javabasic.grammar;

/**
 * Created by qqs on 18/3/23.
 */
public class EnumL {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;

    public static void main(String[] args) {
        EnumL enumL = new EnumL();
        System.out.println(enumL.size.SMALL);
    }



}

