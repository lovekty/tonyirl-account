package me.tony.tonyirl.account.base.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonTest {

    @Test
    public void testListToArray() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        String[] a = new String[1];
        String[] array = list.toArray(a);
        Arrays.stream(array).forEach(System.out::println);
    }
}
