package com.qqs.lesson.variable;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by qqs on 17/12/7.
 */
public class LCollection {

    static Collection<String> collection = new Collection<String>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(String s) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends String> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };


    public static void main(String[] args) {

        try {
            Thread.sleep(100);

            collection.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
