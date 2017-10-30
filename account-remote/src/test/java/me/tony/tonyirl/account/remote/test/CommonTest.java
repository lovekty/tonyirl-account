package me.tony.tonyirl.account.remote.test;

import org.junit.Test;

import java.util.*;

public class CommonTest {

    static Set<String> SET;

    static {
        SET = new HashSet<>();
        SET.add("china");
        SET.add("usa");
        SET.add("uk");
        SET.add("german");
        SET.add("japan");
    }

    @Test
    public void testTime() {
        long array = 0;
        long linked = 0;
        for (int i = 0; i < 10000; i++) {
            array += array();
            linked += linked();
        }
        System.out.println(array);
//        System.out.println(linked);
    }


    long array() {
        List<String> list = new ArrayList<>(32);
        list.add("ada");
        list.add("bob");
        list.add("chloe");
        list.add("david");
        list.add("eva");
        list.add("frank");
        list.add("greg");
        long start = System.nanoTime();
        list.addAll(SET);
        long end = System.nanoTime();
        return end - start;
    }

    long linked() {
        List<String> list = new LinkedList<>();
        list.add("ada");
        list.add("bob");
        list.add("chloe");
        list.add("david");
        list.add("eva");
        list.add("frank");
        list.add("greg");
        long start = System.nanoTime();
        list.addAll(SET);
        long end = System.nanoTime();
        return end - start;
    }
}
