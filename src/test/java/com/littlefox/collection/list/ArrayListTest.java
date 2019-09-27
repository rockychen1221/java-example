package com.littlefox.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListTest {

    @Test
    public void testAdd(){
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add(1,"list");
        list.add(2,"wangwu");
        list.forEach(System.out::println);
    }

    @Test
    public void testAddAll(){
        ArrayList<String> list = new ArrayList<>(3);
        list.add("zhangsan");
        list.add(1,"list");
        list.add(2,"wangwu");
        list.addAll(Arrays.asList("zhaoliu","qianba"));
        list.forEach(System.out::println);
    }


}
